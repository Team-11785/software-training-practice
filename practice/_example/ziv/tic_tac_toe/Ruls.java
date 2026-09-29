package practice._example.ziv.tic_tac_toe;

public class Ruls {
    Board board;
    public Ruls(Board board){
        this.board=board;
    }
    public boolean is_over(){/*only works for 3 on 3 board; core problem */
        int chek_x=0;
        int chek_o=0;
        

          


        for(int i=0;i<board.Get_board_states().length;i++)/*colums x */
        {
            for(int j=0;j<board.Get_board_states()[0].length;j++){
                if(board.Get_board_states()[i][j]==states.X){
                    chek_x++;
                }
                else if(board.Get_board_states()[i][j]==states.O){
                    chek_o++;
                }
            }
            if(chek_x==3){
                System.out.println("THE WINNER IS X!!!");
                return true;
            }
            else if(chek_o==3){
                System.out.println("THE WINNER IS O!!!");
                return true;
            }
             chek_x=0;
             chek_o=0; 
        }


         for(int i=0;i<board.Get_board_states().length;i++){/*rows y */
            for(int j=0;j<board.Get_board_states()[0].length;j++){
                if(board.Get_board_states()[j][i]==states.X){
                    chek_x++;
                }
                else if(board.Get_board_states()[j][i]==states.O){
                    chek_o++;
                }
            }
            if(chek_x==3){
                System.out.println("THE WINNER IS X!!!");
                return true;
            }
            else if(chek_o==3){
                System.out.println("THE WINNER IS O!!!");
                return true;
            }
             chek_x=0;
             chek_o=0;
        }
        
        for(int i=0;i<board.Get_board_states().length;i++)
        {/*downward right diagonal */
            if(board.Get_board_states()[i][i]==states.X){
                    chek_x++;
                }
            else if(board.Get_board_states()[i][i]==states.O)
            {
                    chek_o++;
            }
        }
        if(chek_x==3){
                System.out.println("THE WINNER IS X!!!");
                return true;
            }
            else if(chek_o==3){
                System.out.println("THE WINNER IS O!!!");
                return true;
            }
             chek_x=0;
             chek_o=0;
        


        for(int i=0;i<board.Get_board_states().length;i++)
        {/*upward right diagonal */
            if(board.Get_board_states()[i][board.Get_board_states().length-1-i]==states.X){
                    chek_x++;
                }
            else if(board.Get_board_states()[i][board.Get_board_states().length-1-i]==states.O)
            {
                    chek_o++;
            }
        }
        if(chek_x==3){
                System.out.println("THE WINNER IS X!!!");
                return true;
            }
            else if(chek_o==3){
                System.out.println("THE WINNER IS O!!!");
                return true;
            }
             chek_x=0;
             chek_o=0;
        
        for(int i=0;i<board.Get_board_states().length;i++)/*board is full?? */
        {
            for(int j=0;j<board.Get_board_states()[0].length;j++){
                if(board.Get_board_states()[i][j]==states.X){
                    chek_x++;
                }
                else if(board.Get_board_states()[i][j]==states.O){
                    chek_o++;
                }
            }

        }
        if(chek_o+chek_x==Math.pow(board.Get_board_states().length,2)){
            System.out.println("DRAW!!!");
            return false;
        }
        return false;
    }
    public boolean is_valid(Move move)
    {
        if(move.Get_state()==states.EMPTY){return false;}
        int on_y=move.get_Pos().Get_colum();
        int on_X=move.get_Pos().Get_row();
        if(on_X<0||on_y<0||on_X>board.Get_board_states().length||on_y>board.Get_board_states().length){
            return false;
        }
        if(board.Get_board_states()[on_y][on_X]!=states.EMPTY){
            return false;
        }
        return true;

    }


    
}
