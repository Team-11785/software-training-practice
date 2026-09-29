package practice._example.ziv.tic_tac_toe;

public class Board {
    states[][]board_states;
    public Board(int colums,int rows){
        this.board_states=new states[colums][rows];
        clean_board();

    }
    public void implement_move(Move move){
        board_states[move.get_Pos().Get_colum()][move.get_Pos().Get_row()]=move.Get_state();
    }
    public states Get_current_state(){
        int x_count=0;
        int o_count=0;
        for(int i=0;i<board_states.length;i++){
            for(int j=0;j<board_states[0].length;j++){
                if(board_states[i][j]==states.X){x_count++;}
                else if(board_states[i][j]==states.O){o_count++;}
            }
        }
        if(x_count==o_count){return states.X;}
        return states.O;
    }
    public states[][] Get_board_states(){
        return board_states;
    }
    public void  clean_board(){
        for(int i=0;i<board_states.length;i++){
            for(int j=0;j<board_states[0].length;j++){
                board_states[i][j]=states.EMPTY;
            }
        }
        
    }
    public void print_board(){
        for(int i=0;i<board_states.length;i++){
            System.out.println();
            for(int j=0;j<board_states[0].length;j++){
               System.out.print(board_states[i][j].Get_symbol()+"|"); 
                
            }
        }
    }



}
