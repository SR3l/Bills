public class Calculate_bills {


        private int balance;
        private int hundreds;
        private int fifties;

        public Calculate_bills(int balance, int hundreds, int fifties) {
            this.balance = balance;
            this.hundreds = hundreds;
            this.fifties = fifties;
        }

        public int getHundreds() {
            return Math.min(balance / 100, hundreds);
        }

        public int getFifties() {
            int remaining = balance - getHundreds() * 100;
            return Math.min(remaining / 50, fifties);
        }

        public int getTwenties() {
            int remaining = balance - getHundreds() * 100 - getFifties() * 50;
            return remaining / 20;
        }

        public int getTens() {
            int remaining = balance - getHundreds() * 100 - getFifties() * 50 - getTwenties() * 20;
            return remaining / 10;
        }

        public int getFives() {
            int remaining = balance - getHundreds() * 100 - getFifties() * 50 - getTwenties() * 20 - getTens() * 10;
            return remaining / 5;
        }

        public int getOnes() {
            return balance - getHundreds() * 100 - getFifties() * 50 - getTwenties() * 20 - getTens() * 10 - getFives() * 5;
        }

    }


