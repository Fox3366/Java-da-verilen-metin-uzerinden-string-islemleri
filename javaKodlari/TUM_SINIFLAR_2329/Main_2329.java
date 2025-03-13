import java.util.ArrayList;
import java.util.Scanner;

public class Main_2329 {

	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
//		String text = "Günümüzde teknoloji yoğun olarak kullanılmaktadır. Bunun bir sonucu olarak yapay zekanın kullanımı ön\r\n"
//				+ "plana çıkmıştır. Yapay zekanın ön plana çıkmasıyla ona olan ilgi yapay değil ciddi oranda artmıştır. Bu\r\n"
//				+ "durumdan eğitim kurumları da etkilenmiştir. Eğitim ve öğretimde zekanın gelişimi için kişiselleştirilmiş\r\n"
//				+ "uygulamalar ortaya çıkmıştır. Ayrıca uyarlanabilir akıllı öğrenme sistemleri olarak kullanılan yapay zeka\r\n"
//				+ "uygulamaları da geliştirilmektedir.";
		String text;
		System.out.println("Metin girişi--->");
		text = scanner.nextLine();
		
		while(true)
		{
			System.out.println("***Menu***");
			System.out.println("1 - Metinde tekrar eden kelimeler ve sayıları\n"
					+ "2 - Metindeki cümleler\n"
					+ "3 - Cümlede kelime yer değiştirme\n"
					+ "0 - Çıkış");
			int choice = scanner.nextInt();
			
			switch(choice)
			{
				case 0:
					System.out.println("Çıkış yapıldı!");
					break;
				case 1:
					CountOfRepeat(text);
					break;
				case 2:
					countOfSentence(text);
					break;
				case 3:
					ChangeSentence(text);
					break;
				default:
					System.out.println("Hatalı giriş");
					break;	
			}
			if(choice == 0)
				break;
		}
		
		
		

	}
	
	public static void CountOfRepeat(String text)
	{
        String[] words = text.toLowerCase().replaceAll("[^a-zçğıöşü]", " ").split("\\s+");  //s+: bütün boşluk karakterlerini ifade eder.
        ArrayList<String> wordList = new ArrayList<String>();
        ArrayList<Integer> wordCount = new ArrayList<Integer>();

        for (String word : words)
        {
                if (wordList.contains(word))
                {
                    int index = wordList.indexOf(word);
                    wordCount.set(index, wordCount.get(index) + 1);
                }
                else
                {
                    wordList.add(word);
                    wordCount.add(1);
                }
        }

        for (int i = 0; i < wordList.size(); i++)
        {
            System.out.println(wordList.get(i) + ": " + wordCount.get(i));
        }
        
        System.out.println();
        for(int i=0; i<3; i++)
        {
        	int maxCount = 1;
        	int maxIndex = 1;
        	for(int j=0; j<wordCount.size(); j++)
        	{
        		if(wordCount.get(j) > maxCount)
        		{
        			maxCount = wordCount.get(j);
        			maxIndex = j;
        		}
        	}
        	if(maxIndex != 1)
        	{
        			System.out.println("En cok tekrar eden kelime: "+"'"+wordList.get(maxIndex).toUpperCase()+"' Tekrar sayısı: "+wordCount.get(maxIndex));
        			wordCount.remove(maxIndex);
        			wordList.remove(maxIndex);
        	}
        }
        System.out.println();
	}
	
	public static void countOfSentence(String text)
	{
		String[] sentences = text.split("\\.");
		int a=0;
		for (String string : sentences)
		{
			System.out.println((a+1)+" .Cumle:  "+string.trim());
			System.out.println();
			a++;
		}
		System.out.println("Cümle sayısı: "+sentences.length);
	}
	
	public static void ChangeSentence(String text)
	{
		String[] sentences = text.split("\\s+");
		ArrayList<String> sentenceList = new ArrayList<String>();
		for (String string : sentences)
		{
			sentenceList.add(string);
		}
		
		int indexFirst = 0;
		int indexLast = 0;
		for (String sentence : sentenceList)
		{
			if(sentence.contains("."))
			{
				String temp = sentenceList.get(indexFirst);
				indexLast = sentenceList.indexOf(sentence);
				sentenceList.set(indexFirst, sentenceList.get(indexLast));
				sentenceList.set(indexLast, temp);
				indexFirst = indexLast+1;
			}
		}
		for (String string : sentenceList) {
			System.out.println(string);
		}
	}
	
	
}
