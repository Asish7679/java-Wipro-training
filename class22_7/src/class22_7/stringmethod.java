package class22_7;

public class stringmethod {

	    public static void main(String[] args) {
	        String s = "  Hello, Java Developer!  ";
	        String s2 = "Wipro";
	        

	        System.out.println("Length: " + s.length());
	        System.out.println("Trim: '" + s.trim() + "'");
	        System.out.println("ToUpperCase: " + s.toUpperCase());
	        System.out.println("ToLowerCase: " + s.toLowerCase());
	        System.out.println("CharAt: " + s.charAt(10));
	        System.out.println("IndexOf: " + s.indexOf('a'));
	        System.out.println("LastIndexOf:" + s.lastIndexOf('e'));
	        System.out.println("StartsWith :" + s.startsWith("  He"));
	        System.out.println("EndsWith:" + s.endsWith("!  "));
	        System.out.println("Contains:" + s.contains("Java"));
	        System.out.println("Replace :" + s.replace('a', 'A'));
	        System.out.println("ReplaceAll:" + s.replaceAll("\\s", "-"));
	        System.out.println("ReplaceFirst: " + s.replaceFirst("\\s", "-"));
	        System.out.println("Substring:" + s.substring(2, 7));
	        System.out.println("Equals(s2): " + s.equals(s2));
	        System.out.println("EqualsIgnoreCase(s2): " + s.trim().equalsIgnoreCase(s2));
	        System.out.println("CompareTo(s2): " + s.compareTo(s2));
	        System.out.println("CompareToIgnoreCase(s2): " + s.trim().compareToIgnoreCase(s2));
	        System.out.println("IsEmpty: " + s.isEmpty());
	        System.out.println("Strip: '" + s.strip() + "'");
	        System.out.println("StripLeading: '" + s.stripLeading() + "'");
	        System.out.println("StripTrailing: '" + s.stripTrailing() + "'");
	        System.out.println("Matches " + s.matches(".*Java.*"));
	        StringBuilder sb = new StringBuilder(s.trim());
	        System.out.println("StringBuilder Append: " + sb.append(" Rocks!"));
	        System.out.println("Insert: " + sb.insert(5, "+++"));
	        System.out.println("Reverse: " + sb.reverse());
	        
	    }
	

    }

