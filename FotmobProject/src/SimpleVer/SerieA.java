package SimpleVer;

import java.util.Random;

public class SerieA {
	static Random random = new Random();
	DetailInfo detail_serie = new DetailInfo();
	Simplefotmob simplefm = new Simplefotmob();

	public String[] Teams = { "나폴리", "라치오", "레체", "로마", "몬차", "밀란", "베로나", "볼로냐", "사수올로", "살레르니타나", "아탈란타", "엠폴리",
			"우디네세", "유벤투스", "인테르", "제노아", "칼리아리", "토리노", "프로시노네", "피오렌티나", };
	public String[] Coach = { "뤼디 가르시아", "마우리치오 사리", "로베르트 다베리사", "주제 무리뉴", "라파엘레 팔라디노", "스테파노 피올리", "마르코 바로니",
			"티아고 모타", "알레시오 디오니시", "필리포 인자기", "잔 피에로 가스페리니", "아우렐리오 안드레아촐리", "안드레아 소틸", "마시밀리아노 알레그리", "시모네 인자기",
			"알베르토 질라르디노", "클라우디오 라니에리", "이반 유리치", "에우제비오 디 프란체스코", "빈첸초 이탈리아노", };
	public String[] Hometown = { "스타디오디에고 아르만도 마라도나", "스타디오 올림피코", "스타디오 비아 델 마레", "스타디오 올림피코", "U-파워 스타디움", "산 시로 ",
			"스타디오 마르칸토니오 벤테고디", "스타디오 레나토 달라라", "마페이 스타디움", "스타디오 아레키", "게비스 스타디움", "스타디오 카를로 카스텔라니", "스타디오 프리울리",
			"알리안츠 스타디움", "스타디오 주세페 메아차", "스타디오 루이지 페라리스", "우니폴 도무스", "스타디오 올림피코 그란데 토리노", "스타디오 베니토 스티르페",
			"스타디오 아르테미오 프랑키", };
	public String[] PreviousRank = { "1", "2", "16", "6", "11", "4", "17", "9", "13", "15", "5", "14", "12", "7", "3",
			"A팀 승격(2위)", "A팀 승격(5위)", "10", "A팀 승격(1위)", "8", };

	public String[] Member_Napoli = { "알렉스 메렛", "나탕", "디에고 데메", "주앙 제주스", "마리우 후이", "엘리프 엘마스", "빅터 오시멘", "아미르 라흐마니",
			"니키타 콘티니", "후베르트 이다시아크", "마티아스 올리베라", "지오반니 시메오네", "피오트르 지엘린스키", "마테오 폴리타노", "조반니 디 로렌초", "알레시오 제르빈",
			"옌스 카쥐스트", "예스페르 린스트룀", "레오 외스티고르", "알레산드로 자놀리", "스타니슬라프 로보트카", "잔루카 가에타노", "흐비차 크바라츠헬리아", "자코모 라스파도리",
			"피에를루이지 골리니", "스타니슬라프 로보트카", "잔루카 가에타노", "흐비차 크바라츠헬리아", "자코모 라스파도리", "피에를루이지 골리니", "앙드레프랑크 잠보 앙귀사", };

	public String[] Member_Lazio = { "루카 펠레그리니", "파트리시오 가바론", "마티아스 베시노", "카마다 다이치", "펠리피 안데르송", "마테오 귀앵두지",
			"페드로 로드리게스", "루이스 알베르토", "알레시오 로마뇰리", "니콜로 카살레", "디미트리예 카메노비치", "치로 임모빌레", "구스타프 이삭센", "발렌틴 카스테야노스",
			"마티아 자카니", "디에고 곤살레스", "엘세이드 히사이", "토마 바시치", "마누엘 라차리", "다닐로 카탈디", "루이지 세페", "마리오 힐라", "크리스토스 만다스",
			"알레시오 푸를라네토", "니콜로 로벨라", "아담 마루시치", "이반 프로베델", };

	public String[] Member_Lecce = { "카스트리오 데르마쿠", "마린 폰그라치치", "페데리코 바스키로토", "니콜라 크르스토비치", "페데리코 디프란체스코", "알레산드로 투이아",
			"토리르 요한 헬가손", "발랑탱 장드레", "다니엘 사메크", "페데리코 브란콜리니", "라메크 반다", "욘 비에르켄그렌", "안토니노 갈로", "가브리엘 스트레페자", "알렉시스 블린",
			"유세프 말레", "야스페르 사모야", "아산 시세이", "머돈 베리샤", "마츠 레먼스", "주세페 페첼라", "파블로 로드리게스", "로렌초 베누티", "블라디미로 팔코네", };

	public String[] Member_Roma = { "후이 파트리시우", "릭 카르스도르프", "브라얀 크리스탄테", "에방 은디카", "크리스 스몰링", "로렌초 펠레그리니", "태미 에이브러햄",
			"안드레아 벨로티", "디에고 요렌테", "레안드로 파레데스", "사르다르 아즈문", "제키 첼리크", "헤나투 산체스", "파울로 디발라", "후셈 아우아르", "잔루카 만치니",
			"마라쉬 쿰불라", "레오나르도 스피나촐라", "라스무스 크리스텐센", "에도아르도 보베", "니콜라 잘레프스키", "피에트로 보에르", "로멜루 루카쿠", "스테판 엘샤라위",
			"밀레 스빌라르", };

	public String[] Member_Monza = { "에우제니오 라만나", "줄리오 도나티", "파블로 마리", "루카 칼디롤라", "로베르토 갈리아르디니", "호세 마친", "안드레아 바르베리스",
			"마티아 발로티", "미켈레 디그레고리오", "파푸 고메스", "사무엘레 비린델리", "마테오 스코차렐라", "미르코 마리치", "가브리엘레 페라리니", "발렌틴 안토프", "안드레아 콜파니",
			"가브리엘 팔레타", "마테오 페시나", "다닐로 담브로시오", "루카 마로네", "안드레아 페타냐", "와렌 봉도", "안드레아 카르보니", "다니 모타", "아르만도 이초",
			"니콜라 리고니", "살바토레 몰리나", "사무엘레 비냐토", "파트리크 치우리아", "알레산드로 소렌티노", "조르조 치타디니", "기오르고스 키리아코풀로스", };

	public String[] Member_Milan = { "다비데 칼라브리아", "이스마엘 베나세르", "야신 아들리", "루벤 로프터스치크", "올리비에 지루", "하파엘 레앙", "크리스천 풀리식",
			"티자니 라인더르스", "루카 요비치", "마이크 메냥", "노아 오카포", "루카 로메로", "테오 에르난데스", "피에르 칼룰루", "사무엘 추쿠에제", "피카요 토모리", "시몬 키예르",
			"말리크 치아우", "마티아 칼다라", "마르코 펠레그리노", "톰마소 포베가", "라데 크루니치", "알레산드로 플로렌치", "마르코 스포르티엘로", "라포 나바", "차카 트라오레",
			"유누스 무사", "안토니오 미란테", };

	public String[] Member_Verona = { "로렌초 몬티포", "조시 도이그", "미겔 벨로주", "다비데 파라오니", "이삭 히엔", "다르코 라조비치", "토마 앙리",
			"아이딘 흐루스티치", "케빈 라사냐", "마티아 키에사", "페데리코 체케리니", "마르탱 옹글라", "밀란 주리치", "로베르토 피콜리", "알레산드로 베라르디", "잔자코모 마냐니",
			"필리포 테라치아노", "파베우 다비도비츠", "마테우시 프라셸리크", "파비오 데파올리", "야예 칼론", "후안 카발", "온드레이 두다", "시모네 페릴리", "디에고 코폴라",
			"알레산드로 코르티노비스", "이브라힘 술레마나", "올리버 아빌고르", };

	public String[] Member_Bologna = { "프란체스코 바르디", "슈테판 포슈", "호아킨 소사", "아다마 수마오로", "리카르도 오르솔리니", "니콜라스 도밍게스",
			"조슈아 지르크제이", "케빈 보니파지", "우사마 엘 아주우쥐", "안토니오 라이몬도", "루이스 퍼거슨", "미셸 애비셔", "로베르토 소리아노", "차랄람보스 리코지아니스",
			"니콜라 바뇰리니", "혼 루쿠미", "우카시 스코룹스키", "로렌초 데 실베스트리", "샘 뵈케마", "덴소 카시우스", "안드레아 캄비아소", "에마누엘 비냐토", "위스덤 아메이",
			"카츠페르 우르반스키", "무사 바로우" };

	public String[] Member_Sassuolo = { "마르쿠스 홀름그렌 페데르센", "마르틴 에를리치", "우로스 라치치", "마테우스 엔히키", "압두 하루이", "안드레아 피나몬티",
			"도메니코 베라르디", "아구스틴 알바레스", "잔 마르코 페라리", "페드로 오비앙", "에밀 케이데", "마티아스 비냐", "필리포 로마냐", "네딤 바이라미", "제레미 톨리안",
			"잔루카 페골로", "막심 로페스", "알레시오 크라뇨", "루카 리파니", "크리스티안 토르스트베트", "후안 트레솔디", "아르망 로리엔테", "안드레아 콘실리", "알레산드로 루소",
			"그레고리 데프렐", };

	public String[] Member_Salernitana = { "빈첸초 피오릴로", "딜랑 브론", "도마고이 브라다리치", "플라비우스 다닐리우크", "주니어 삼비아", "에밀 보히넨",
			"페데리코 보나촐리", "에리크 부트하임", "기예르모 오초아", "디에고 발렌시아", "이반 라도바노비치", "페데리코 파시오", "라사나 쿨리발리", "율리안 크리스토페르센",
			"그리고리스 카스타노스", "노르베르트 기옴베르", "줄리오 마조레", "사나시 시", "레오나르도 카페치", "불라이 디아", "파스콸레 마초키", "루이지 세페",
			"한스 니콜루시 카빌리아", "마테오 로바토", "안토니오 칸드레바", "로렌초 피롤라", };

	String[] Member_Juventus = { "보이치에흐 슈체스니", "마티아 데실리오", "글레이송 브레메르", "페데리코 가티", "마누엘 로카텔리", "다닐루", "페데리코 키에사",
			"두샨 블라호비치", "폴 포그바", "필립 코스티치", "알렉스 산드루", "딘 하위센", "아르카디우스 밀리크", "케난 일디즈", "웨스턴 맥케니", "사무엘 일링주니어", "모이스 킨",
			"파비오 미레티", "니콜로 파지올리", "티모시 웨아", "카를로 핀솔리오", "다니엘레 루가니", "아드리앙 라비오", "안드레아 캄비아소", "마티아 페린", };

	String[] Member_Atalanta = { "후안 무소", "하파엘 톨로이", "에밀 홀름", "호세 루이스 팔로미노", "퇸 코프메이너르스", "마리오 파샬리치", "루이스 무리엘",
			"엘 빌랄 투레", "아데몰라 루크먼", "에데르송", "마르턴 더론", "샤를 더케텔라러", "베라트 짐시티", "미첼 바커", "나디르 조르테아", "마테오 루제리", "세아드 콜라시나츠",
			"미셸 아도포", "마르코 카르네세키", "프란체스코 로시", "한스 하테부르", "조르조 스칼비니", "조반니 본판티", "알렉세이 미란추크", "다비데 차파코스타",
			"잔루카 스카마카", };

	String[] Member_Empoli = { "사무엘레 페리산", "리베라토 카카체", "세바스티안 발루키에비츠", "알베르토 그라시", "리암 헨더슨", "마르코 피아차", "엠마누엘 에콩",
			"러즈반 마린", "프란체스코 카푸토", "두치오 델리 이노센티", "야코포 파치니", "사미르 우이카니", "마티아 데스트로", "티호네 에부에히", "엘리아 카프릴레", "로렌초 토넬리",
			"니콜로 캄비아기", "페타르 스토야노비치", "니콜라스 하스", "세바스티아노 루페르토", "아르디안 이스마일리", "톰마소 발단치", "가브리엘레 구아리노", "로브로 스투블랴르",
			"에르쿨라노 나비안", };

	String[] Member_Udinese = { "마르코 실베스트리", "페스티 에보셀리", "아담 마시나", "산디 로브리치", "장 빅토르 마켕고", "아이작 석세스", "마르빈 제이헬라르",
			"제라르 데울로페우", "왈라시", "레오나르도 부타", "안토니오 티크비치", "네우엔 페레스", "킹슬리 에히지부에", "다니엘레 파델리", "엔조 에보스", "라자르 사마르지치",
			"플로리앙 토뱅", "야카 비욜", "마르틴 파예로", "토마스 크리스텐센", "로베르토 페레이라", "악셀 게상", "시모네 파푼디", "에도아르도 피아나", "조던 제무라",
			"로렌초 루카", "에티엔 카마라", "브레네르", "크리스티앙 카바셀레", };

	String[] Member_Internazionale = { "얀 조머", "덴절 뒴프리스", "스테파노 센시", "스테판 더프레이", "후안 콰드라도", "마르코 아르나우토비치", "마르쿠스 튀랑",
			"라우타로 마르티네스", "라파엘레 디젠나로", "데이비 클라선", "프란체스코 아체르비", "다비데 프라테시", "하칸 찰하놀루", "크리스티안 아슬라니", "헨리크 미키타리안",
			"니콜로 바렐라", "뱅자맹 파바르", "카를루스 아우구스투", "얀 아우렐 비세크", "페데리코 디마르코", "마테오 다르미안", "루시엥 아구메", "알렉시스 산체스", "에밀 아우데로",
			"알레산드로 바스토니", };

	String[] Member_Genoa = { "주젭 마르티네스", "모르텐 토르스비", "레나르트 치보라", "라두 드라구신", "케빈 스트로트만", "마시모 코다", "주니오르 메시아스",
			"알베르트 그뷔드뮌손", "마티아 바니", "알레산드로 볼리아코", "루슬란 말리노우스키", "케일럽 에큐반", "마테오 레테기", "스테파노 사벨리", "켈빈 예보아", "요한 바스케스",
			"필리프 야기에워", "베르칸 쿠틀루", "스테파노 스투라로", "슈테판 일장커", "알란 마투로", "모르텐 프렌드루프", "실반 헤프티", "밀란 바델", "귀벤 얄츤",
			"리데시아노 합스", "게오르게 푸스카스", "주세페 아고스티노", "마놀로 포르타노바", "마르코 파야치", "니콜라 릴리", "아론 마르틴", };

	String[] Member_Cagliari = { "보리스 라두노비치", "에도아르도 골다니가", "알베르토 도세나", "마르코 만코수", "마르코 로그", "나이탄 난데스", "잔루카 라파둘라",
			"니콜라스 비올라", "알레산드로 데이올라", "조르조 알타레", "시모네 아레스티", "빈첸초 밀리코", "가스통 페레이로", "주세페 치오치", "눈치오 렐라", "엘리오 카프라도시",
			"안토니오 바레카", "가브리엘레 자파", "앙투안 마쿰부", "레오나르도 파볼레티", "아담 오베르트", "크리스토스 쿠르파리디스", "엘도르 쇼무로도프", "지토 루봄보",
			"이사이아스 델푸포", "알레산드로 디 파르도", "시몬 스쿠페" };

	String[] Member_Torino = { "주젭 마르티네스", "모르텐 토르스비", "레나르트 치보라", "라두 드라구신", "케빈 스트로트만", "마시모 코다", "주니오르 메시아스",
			"알베르트 그뷔드뮌손", "마티아 바니", "알레산드로 볼리아코", "루카 제멜로", "페르 스휘르스", "알레산드로 부온조르노", "다비트 지마", "얀 카라모", "이반 일리치",
			"안토니오 사나브리아", "네마냐 라도니치", "피에트로 펠레그리", "리카르도 로드리게스", "사바 사조노프", "니콜라 블라시치", "라울 벨라노바", "발렌티노 라자로", "뎀바 세크",
			"코피 지지", "머르김 보이보다", "사무엘레 리치", "바냐 밀린코비치사비치", "아드리앵 타메즈", "그비다스 기네이티스", "미하이 포파", "마테오 피오렌차", "카롤 리네티",
			"두반 사파타", "브란돈 소피", "앙주 코메낭 은게상", };

	String[] Member_Frosinone = { "피에를루이지 프라탈리", "리카르도 마르키차", "마르코 브레시아니니", "칼레브 오콜리", "시모네 로마뇰리", "하이메 바에스", "카를로 룰리치",
			"카이우 조르지", "주세페 카소", "마르빈 쿠니", "헤이니에르 제주스", "마티아시 카만젝파히치", "프란체스코 겔리", "루카 가리타노", "기오르기 크베르나제", "마티아스 소울레",
			"폴 리롤라", "압두 하루이", "앙토니 오요노", "세르지오 칼라이", "메흐디 부라비아", "수피안 비다위", "아리욘 이브라히모비치", "일라리오 몬테리시", "미켈레 체로폴리니",
			"미켈레 아벨라", "루카 마치텔리", "엔소 바레네체아", "왈리드 셰디라", "스테파노 투라티", };

	String[] Member_Fiorentina = { "피에트로 테라치아노", "도도 코르데이루", "크리스티아노 비라기", "니콜라 밀렌코비치", "자코모 보나벤투라", "아르투르 멜루",
			"리카르도 소틸", "막심 로페스", "루카스 벨트란", "니콜라스 곤살레스", "조나단 이코네", "루카 라니에리", "가에타노 카스트로빌리", "음발라 은졸라", "지노 인판티노",
			"예리 미나", "루카스 마르티네스 콰르타", "톰마소 마르티넬리", "알프레드 던컨", "마이클 카요데", "피에트로 코무조", "롤란도 만드라고라", "톰마소 바누치",
			"올리버 크리스텐센", "파비아노 파리시", "니콜로 피에로치", "안토닌 바라크", "로렌초 아마투치", "요시프 브레칼로", "크리스티앙 쿠아메", };
	
	public String[] bestplayer = { Member_Napoli[random.nextInt(Member_Napoli.length)],
			Member_Lazio[random.nextInt(Member_Lazio.length)], 
			Member_Lecce[random.nextInt(Member_Lecce.length)],
			Member_Roma[random.nextInt(Member_Roma.length)], 
			Member_Monza[random.nextInt(Member_Monza.length)],
			Member_Milan[random.nextInt(Member_Milan.length)], 
			Member_Verona[random.nextInt(Member_Verona.length)],
			Member_Bologna[random.nextInt(Member_Bologna.length)],
			Member_Sassuolo[random.nextInt(Member_Sassuolo.length)],
			Member_Salernitana[random.nextInt(Member_Salernitana.length)],
			Member_Juventus[random.nextInt(Member_Juventus.length)],
			Member_Atalanta[random.nextInt(Member_Atalanta.length)],
			Member_Empoli[random.nextInt(Member_Empoli.length)], 
			Member_Udinese[random.nextInt(Member_Udinese.length)],
			Member_Internazionale[random.nextInt(Member_Internazionale.length)],
			Member_Genoa[random.nextInt(Member_Genoa.length)], 
			Member_Cagliari[random.nextInt(Member_Cagliari.length)],
			Member_Torino[random.nextInt(Member_Torino.length)],
			Member_Frosinone[random.nextInt(Member_Frosinone.length)], };
}
