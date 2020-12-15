import java.util.Scanner;
public class MusicApp {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(true) {
			System.out.print("音楽ファイル名>");
			String fileName=sc.next();
			try {
				showFile(fileName);
			} catch (UnsupportedMusicFileException e) {
				System.out.println(e.getMessage());
			}

			if(!fileName.contains(".")) {
				System.out.println("アプリを終了します。");
				return;
			}
		}
	}
	public static void showFile(String fileName) throws UnsupportedMusicFileException {
		String[] data=fileName.split("\\.");
		if(data.length != 2) {
			throw new UnsupportedMusicFileException("未対応のファイルです");
		}
		String ext=data[1];
		String[] arr= {"mp3","wav","ogg","aiff"};
		int i;
		for(i=0;i<arr.length;i++) {
			if(arr[i].equals(ext)) {
				break;
			}
		}
		if(i==arr.length) {
			throw new UnsupportedMusicFileException("未対応のファイルです");
		}
		System.out.println(fileName+"を再生します。");
	}


}
