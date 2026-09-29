package practice._example.ziv.tic_tac_toe;

import java.util.Random;

public class Game implements Icreate {
    Board board;
    Ruls ruls;
    int turn;
    public Game(){
        this.board=new Board(3,3);
        this.ruls=new Ruls(board);
        this.turn=0;
    }
    public void play(){
        
        prepare_game();
        while(!ruls.is_over()){
            print_board();
            turn();
           
        }
        print_board();
        System.out.println("Game over");
    }
    public void turn(){
        Move curr_move=create_move_random();
        while(!ruls.is_valid(curr_move)){
            curr_move=create_move_random();
        }
        board.implement_move(curr_move);
    }
    public void prepare_game(){
        this.board.clean_board();
        this.turn=0;

    }
    public Board Get_board(){
        return this.board;
    }
    public void print_board(){
    System.out.println();
    System.out.println("---------");
    this.board.print_board();
    System.out.println();
    System.out.println("---------");
    }
   public Move create_move_random()
    {
        Random rnd = new Random();
        states curr_state=board.Get_current_state();
        Pos rnd_pos=new Pos(rnd.nextInt(0,board.Get_board_states().length),rnd.nextInt(0,board.Get_board_states()[0].length));
        return new Move(curr_state,rnd_pos);
    }
    
}
