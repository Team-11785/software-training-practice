package practice._example.ziv.tic_tac_toe;

public class Move {
    states state;
    Pos pos;
    public Move(states state, Pos pos){
        this.state=state;
        this.pos =pos;
    }
    public Pos get_Pos(){
        return pos;
    }
    public states Get_state(){
        return state;
    }
}
