package com.strings;
public class demmo2 {
	public static void main(String[] args) {
		String name1= "capgemini";
		String name2 = "capgemini";
		String name3 = "CAPGEMINI";
		String name4 = "shiva  %s";
		String details = "Name:%s Age:%d Salary:%f Intial:%c";
		String name5 = new String("capgemini");
		String name6 = " ";
		String name7 = "shiva";
		String name8 = "Shiva prasad";
		String name9 = "Shiva jakki";
		System.out.println("char at                :"+name1.charAt(0));
		System.out.println("length                 :"+name1.length());
		System.out.println("codeppoint             :"+name1.codePointAt(0));
		System.out.println("codepoint before       :"+name1.codePointBefore(1));
		System.out.println("codepointcount         :"+name1.codePointCount(1, 4));
		System.out.println("compare to             :"+name1.compareTo(name2));
		System.out.println("concat                 :"+name1.concat(" india"));
		System.out.println("contains               :"+name1.contains(" mini"));
		System.out.println("contentequalsto        :"+name1.contentEquals(name2));
		System.out.println("endswith               :"+name1.endsWith("k"));
		System.out.println("equals                 :"+name1.equals(name2));
		System.out.println("equalsIgnoreCase       :"+name1.equalsIgnoreCase(name3));
		System.out.println("formatted              :"+name4.formatted("Shiva"));
		System.out.println("details formatted      :"+details.formatted("shiva",23,900.0,'s'));
		System.out.println("hashcode               :"+name1.hashCode());
		System.out.println(name1);
		System.out.println("indent                 :"+name1.indent(3));
		System.out.println("index of               :"+name1.indexOf('c'));
		System.out.println("index of 1,3           :"+name1.indexOf('1', 3));
		System.out.println("index of ini , 4       :"+name1.indexOf("ini", 4));
		System.out.println("intern                 :"+name5.intern()==name1);
		System.out.println("is blank               :"+name6.isBlank());//t
		System.out.println("is empty               :"+name6.isEmpty());//f
		System.out.println("last index             :"+name1.lastIndexOf('i'));
		System.out.println("matches                :"+name7.matches("[a-z]+"));
		System.out.println("offsetbycodepoints     :"+name1.offsetByCodePoints(1, 4));
		System.out.println("region matches         :"+name8.regionMatches (0, name9, 0, 6));
		System.out.println("repeat                 :"+name1.repeat(5));
		System.out.println("replace                :"+name1.replace('c', 's'));
		System.out.println("replace words          :"+name1.replace("mini", "sathya"));
		System.out.println("replace first          :"+name1.replaceFirst(name1, "welcome"));
		System.out.println("starts with            :"+name1.startsWith("mini"));
		}

}
