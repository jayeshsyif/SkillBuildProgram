package files.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileUtils {


	
	public static void copy(File sourceLocation, File targetLocation) throws IOException {
		if (sourceLocation.isDirectory()) {
			copyDirectory(sourceLocation, targetLocation);
		} else {
			copyFile(sourceLocation, targetLocation);
		}
	}

	private static  void copyDirectory(File source, File target) throws IOException {
		if (!target.exists()) {
			target.mkdir();
		}

		for (String f : source.list()) {
			copy(new File(source, f), new File(target, f));
		}
	}

	private static void copyFile(File source, File target) throws IOException {        
		try{	
			if(!target.exists())
			{
				target.createNewFile();
			}
			InputStream in = new FileInputStream(source);
			OutputStream out = new FileOutputStream(target);
			byte[] buf = new byte[1024];
			int length;
			while ((length = in.read(buf)) > 0) 
			{
				out.write(buf, 0, length);
			}
			in.close();
			out.close();
			System.out.println("Copying Done for: "+source.getAbsolutePath()+" "+target.getAbsolutePath());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	public static boolean renameFile(File source, File target) throws IOException {  
		boolean flag =  source.renameTo(target);
		if(flag)
		{
			System.out.println("Rename successful for "+source.getName()+" to "+target.getName());
		}else
		{
			System.err.println("Unable to rename "+source.getAbsolutePath()+" to "+target.getAbsolutePath());
		}
		return flag;
	}
	public static boolean deleteRecursive(File path) throws FileNotFoundException{
		if (!path.exists()) throw new FileNotFoundException(path.getAbsolutePath());
		boolean ret = true;
		if (path.isDirectory()){
			for (File f : path.listFiles()){
				ret = ret && deleteRecursive(f);
			}
		}
		return ret && path.delete();
	}
	public static String getMimeType(String pathText){
		String mime = null;
		/*try
		{
		  Tika mimeTika = new Tika();
		  File file = new File(pathText);
		  mime = mimeTika.detect(file);
		  logger.debug("Mime type for: "+pathText+" is : "+mime);
		}catch(Exception e)
		{
			mime = null;
		}*/
		  return mime;
	  }
	
	public static void copySingleFile(File source, File target) throws IOException {        
		try{
			InputStream in = new FileInputStream(source);
			OutputStream out = new FileOutputStream(target);
			byte[] buf = new byte[1024];
			int length;
			while ((length = in.read(buf)) > 0) 
			{
				out.write(buf, 0, length);
			}
			in.close();
			out.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
