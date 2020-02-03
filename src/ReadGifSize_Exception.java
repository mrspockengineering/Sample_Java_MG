import java.io.RandomAccessFile;
import java.io.FileNotFoundException;
import java.io.IOException;

class ReadGifSize_Exception{
	public static void main(String args[]) {
		System.out.println("Start Random Access File");

		RandomAccessFile f = null;
		
		try
		{
		  f = new RandomAccessFile( "sample.gif", "r" );
		  f.seek( 6 );
		
		  System.out.printf( "%s x %s Pixel%n", f.read() + f.read() * 256,
		                     f.read() + f.read() * 256 );
		
		  f.close();
		}
//		nur als Sample für Exception- Hierarchie
//		catch (IndexOutOfBoundsException e) {
//			System.err.println( "Index Out of Bounds");
//		}
		
		catch ( FileNotFoundException e )
		{
		  System.err.println( "Datei ist nicht vorhanden!" );
		}
//		catch ( IOException e )
//		{
//		  System.err.println( "Allgemeiner Ein-/Ausgabefehler!" );
//		}
		catch (Exception e) {
			System.out.println("allg. Exception");
		}

		finally
		{
		  if ( f != null )
		    try { f.close(); } catch ( IOException e ) { }
		}
	}
}
	