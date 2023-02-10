package inheritence;

public class testBank {

    public static void main(String[] args) {

        //Inheritence

        allBanks M = new allBanks();
        M.member();

        TDbank T = new TDbank();
        T.withdrawal();

        Scotiabank S = new Scotiabank();
        S.deposit();
        S.member();

        BMObank B = new BMObank();
        B.rateOfInterest();


    }
}






