package Enumerationn;

enum Size {
		   SMALL {

			      // overriding toString() for SMALL
			      public String toString() {
			        return "The size is small.";
			      }
			   },

			   MEDIUM {

			     // overriding toString() for MEDIUM
			      public String toString() {
			        return "The size is medium.";
			      }
			   };
			}
class ToStringg{
	public static void main(String args[]) {
		Size s=null;
		System.out.println(s.SMALL.toString());
	}
}