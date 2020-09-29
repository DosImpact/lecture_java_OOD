// 영어 스펠체커로 구현, 영어 관련 기능은 EnglishSpellChecker가 단일책임 
public class EnglishSpellChecker implements ISpellChecker {

	@Override
	public void check() {
		System.out.println("English Spell Checking...");
	}

}
