public class Flood_Fill_Algo {

    public int[][] flood_fill(int[][] img, int sr, int sc, int color) {
        if (img[sr][sc] == color)
            return img; // fix index and return type
        fill(img, sr, sc, color, img[sr][sc]);
        return img;
    }

    public void fill(int[][] img, int sr, int sc, int color, int curr) {
        if (sr < 0 || sr >= img.length || sc < 0 || sc >= img[0].length || img[sr][sc] != curr)
            return;

        img[sr][sc] = color;

        fill(img, sr + 1, sc, color, curr);
        fill(img, sr - 1, sc, color, curr);
        fill(img, sr, sc + 1, color, curr);
        fill(img, sr, sc - 1, color, curr);
    }

    public static void main(String[] args) {
        Flood_Fill_Algo obj = new Flood_Fill_Algo();

        int[][] img = {
                { 1, 1, 1 },
                { 1, 1, 0 },
                { 1, 0, 1 }
        };

        int sr = 1, sc = 1, color = 2;

        int[][] result = obj.flood_fill(img, sr, sc, color);

        // Print the image after flood fill
        for (int[] row : result) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}