class Solution {

    public boolean isValidRow(char[][] board,int row,char ele){
        boolean valid = false;
        for(int i=0;i<9;i++){
            if(board[row][i]==ele){
                if(valid){
                    return false;
                }
                else{
                    valid = true;
                }
            }
        }
        return valid;

    }
    public boolean isValidCol(char[][] board,int col,char ele){
        boolean valid = false;
        for(int i=0;i<9;i++){
            if(board[i][col]==ele){
                if(valid){
                    return false;
                }
                else{
                    valid = true;
                }
            }
        }
        return valid;

    }

    public boolean isValidGrid(char[][] borad,int row,int col, char ele) {
        if(row <=2 && col <=2 ){
            return checkGrid(borad,0,2,0,2,ele);
        }
        else if((row>2 && row<=5) && (col<=2)){
            return checkGrid(borad,3,5,0,2,ele);
        }
        else if((row>5 && row<=8) && (col<=2)){
            return checkGrid(borad,6,8,0,2,ele);
        }
        if(row <=2 && (col > 2 && col <=5) ){
            return checkGrid(borad,0,2,3,5,ele);
        }
        else if((row>2 && row<=5) && (col > 2 && col <=5)){
            return checkGrid(borad,3,5,3,5,ele);
        }
        else if((row>5 && row<=8) && (col > 2 && col <=5)){
            return checkGrid(borad,6,8,3,5,ele);
        }

        if(row <=2 && (col > 5 && col <=8) ){
            return checkGrid(borad,0,2,6,8,ele);
        }
        else if((row>2 && row<=5) && (col > 5 && col <=8)){
            return checkGrid(borad,3,5,6,8,ele);
        }
        else if((row>5 && row<=8) && (col > 5 && col <=8)){
            return checkGrid(borad,6,8,6,8,ele);
        }

        return false;

    }
    public boolean checkGrid(char[][] board,int rowStart,int rowEnd,int colStart,int colEnd, char ele){
        boolean valid = false;
        for(int i=rowStart; i<=rowEnd;i++){
            for(int j=colStart;j<=colEnd;j++){
                if(board[i][j]==ele){
                    if(valid) return false;
                    else valid= true;
                }
            }

        }
        return valid;
    }
    public boolean isValidSudoku(char[][] board) {
        boolean valid = true;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    valid = (isValidRow(board,i,board[i][j]) &&isValidCol(board,j,board[i][j]) && isValidGrid(board,i,j,board[i][j]));
                    if(!valid) return false;
                }
            }
        }
        return valid;
    }
}