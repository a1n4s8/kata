public class Spiders {

    public static void main(String[] args) {
        System.out.println(drawSpider(3, 2, 'w', 'O'));

//        drawSpider(2, 2, 'w', 'O');
    }

    public static String drawSpider(int legSize, int bodySize, char mouth, char eye) {
        String leftleg = "^";
        String rightleg = "^";
        String drawEye = "";
        String body = "";

        switch (legSize) {
            case 1:
                break;
            case 2:
                leftleg = "/\\";
                rightleg = leftleg;
                break;
            case 3:
                leftleg = "/╲";
                rightleg = "╱\\";
                break;
            case 4:
                leftleg = "╱╲";
                rightleg =leftleg;
                break;
        }

        for (int i = 0; i < bodySize; i++) {
            body += "(";
        }

        for (int j = 0; j < Math.pow(2, bodySize) / 2; j++) {
            drawEye += eye;
        }

        StringBuffer half = new StringBuffer();

        half.append(body);
        half.append(drawEye);

        String left = half.toString();
        String right = half.reverse().toString();
        right = right.replace('(',')');

        return leftleg+left+mouth+right+rightleg;
    }
}
