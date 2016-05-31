package files.example;

import java.io.File;
import java.io.IOException;

public class RenameFile {
	static int fileCount=1;

	public static void main(String[] args) {

		readDir("C:\\Users\\102631.TFCORP\\Desktop\\Hiren (arati didi) wedding");
	}
	private static void readDir(String path)
	{
		File source= new File(path);
		for (String f : source.list())
		{
			File file = new File(source,f);
			if(file.isDirectory())
			{
				readDir(file.getAbsolutePath());
			}else if(file.isFile())
			{
				String[] arr = file.getAbsolutePath().split("\\\\");
				//StringBuilder sb = new StringBuilder("");
				String renameTo ="";
				int length = arr.length;
				for(int i=0; i < length;i++)
				{
					if( i < length-1)
					{
						//sb.append(arr[i]).append("\\");
					}else if( i == length-1)
					{
						StringBuilder sb = new StringBuilder("");
						sb.append("Hiren Wedding ").append(fileCount).append(".").append(arr[i].split("\\.")[1]);
						renameTo = sb.toString();
					}
				}
				fileCount++;
				File fileRenamedTo = new File(source,renameTo);
				try {
					FileUtils.renameFile(file, fileRenamedTo);
				} catch (IOException e) {
					System.err.println("Error renaming file "+file.getAbsolutePath());
					e.printStackTrace();
				}
			}
		}
	}@SuppressWarnings("unused")
	private static void readDir2(String path)
	{
		File source= new File(path);
		for (File file : source.listFiles())
		{
			if(file.isDirectory())
			{
				readDir2(file.getAbsolutePath());
			}else if(file.isFile())
			{
				System.out.println(file.getAbsolutePath());
			}
		}
	}
}
