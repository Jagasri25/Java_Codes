import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageToAscii {

    // Define the symbols and thresholds
    private static final String[] SYMBOLS = {"#", "-", "*", ".", "+", "o"};
    private static final int[] THRESHOLDS = {0, 50, 100, 150, 200};

    public static void main(String[] args) {
        String imagePath = "sample_image.png"; // Default image path

        if (args.length == 1) {
            System.out.println("Using " + args[0] + " as Image Path\n");
            imagePath = args[0];
        } else {
            System.out.println("Image Path not specified: Using sample_image.png\n");
        }

        try {
            // Read the image in grayscale
            BufferedImage image = ImageIO.read(new File(imagePath));
            BufferedImage grayImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
            grayImage.getGraphics().drawImage(image, 0, 0, null);

            // Convert the image to ASCII and print it
            int[][] asciiArray = imgToAscii(grayImage);
            printOutAscii(asciiArray);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int[][] imgToAscii(BufferedImage image) {
        int width = image.getWidth();
        int height = image.getHeight();

        // Resize parameters
        int newWidth = width / 20;
        int newHeight = height / 40;

        int[][] asciiArray = new int[newHeight][newWidth];

        // Resize image and convert to ASCII
        for (int y = 0; y < newHeight; y++) {
            for (int x = 0; x < newWidth; x++) {
                // Calculate average value for a block of pixels
                int pixelSum = 0;
                int pixelCount = 0;

                for (int yy = y * 40; yy < (y + 1) * 40 && yy < height; yy++) {
                    for (int xx = x * 20; xx < (x + 1) * 20 && xx < width; xx++) {
                        int pixel = image.getRGB(xx, yy) & 0xFF; // Grayscale value
                        pixelSum += pixel;
                        pixelCount++;
                    }
                }

                int averagePixel = pixelSum / pixelCount;
                int asciiIndex = 0;

                for (int i = 0; i < THRESHOLDS.length; i++) {
                    if (averagePixel > THRESHOLDS[i]) {
                        asciiIndex = i;
                    }
                }

                asciiArray[y][x] = asciiIndex;
            }
        }

        return asciiArray;
    }

    private static void printOutAscii(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(SYMBOLS[value % SYMBOLS.length]);
            }
            System.out.println();
        }
    }
}
