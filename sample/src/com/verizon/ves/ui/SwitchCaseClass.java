package com.verizon.ves.ui;

public class SwitchCaseClass {
	
	public String billingStateName(int bstateid) {
		String bstate = null;
		switch (bstateid) {
		case 1:
			bstate = "Alaska";
			break;

		case 2:
			bstate = "Arizona";
			break;

		case 3:
			bstate = "California";
			break;

		case 4:
			bstate = "Colorado";
			break;

		case 5:
			bstate = "Florida";
			break;

		case 6:
			bstate = "Georgia";
			break;

		case 7:
			bstate = "Hawaii";
			break;

		case 8:
			bstate = "Indiana";
			break;

		case 9:
			bstate = "Kentucky";
			break;

		case 10:
			bstate = "Michigan";
			break;

		case 11:
			bstate = "Mississippi";
			break;

		case 12:
			bstate = "Missouri";
			break;

		case 13:
			bstate = "New Hamsphire";
			break;

		case 14:
			bstate = "New Jersy";
			break;

		case 15:
			bstate = "New Mexico";
			break;

		case 16:
			bstate = "New York";
			break;

		case 17:
			bstate = "Oklahoma";
			break;

		case 18:
			bstate = "Oregon";
			break;

		case 19:
			bstate = "Pennsylvania";
			break;

		case 20:
			bstate = "Tennesse";
			break;

		case 21:
			bstate = "Texas";
			break;

		case 22:
			bstate = "Vermont";
			break;

		case 23:
			bstate = "Virginia";
			break;

		case 24:
			bstate = "Washington";
			break;

		case 25:
			bstate = "West Virginia";
			break;
		}
		return bstate;
	}

	public String connectionStateName(int cstateid) {
		String cstate = null;
		switch(cstateid){
		case 1:
			 cstate="Alaska";
		break;

		case 2:
			 cstate="Arizona";
		break;

		case 3:
			 cstate="California";
		break;

		case 4:
			 cstate="Colorado";
		break;

		case 5:
			 cstate="Florida";
		break;

		case 6:
			 cstate="Georgia";
		break;

		case 7:
			 cstate="Hawaii";
		break;

		case 8:
			 cstate="Indiana";
		break;

		case 9:
			 cstate="Kentucky";
		break;

		case 10:
			 cstate="Michigan";
		break;

		case 11:
			 cstate="Mississippi";
		break;

		case 12:
			 cstate="Missouri";
		break;

		case 13:
			 cstate="New Hamsphire";
		break;

		case 14:
			 cstate="New Jersy";
		break;

		case 15:
			 cstate="New Mexico";
		break;

		case 16:
			 cstate="New York";
		break;

		case 17:
			 cstate="Oklahoma";
		break;

		case 18:
			 cstate="Oregon";
		break;

		case 19:
			 cstate="Pennsylvania";
		break;

		case 20:
			 cstate="Tennesse";
		break;

		case 21:
			 cstate="Texas";
		break;

		case 22:
			 cstate="Vermont";
		break;

		case 23:
			 cstate="Virginia";
		break;

		case 24:
			 cstate="Washington";
		break;

		case 25:
			 cstate="West Virginia";
		break;
	}
		
		return cstate;
	}
	public String serviceName(String servicecode){
	
		String servicename = null;
		
	switch(servicecode){
	
	case "b2000" :
		servicename = "ap_3g_200_vo_200";
		break;
	case "b2001" :
		servicename = "ap_4g_250_vi_200";
		break;
	case "b2002" :
		servicename = "pi_vovi_250_200_125";
		break;
	case "b2003" :
		servicename = "pi_vi_250_250_225";
		break;
	case "b2004" :
		servicename = "api_4g_250_vi_200_200_125";
		break;
	case "b2005" :
		servicename = "api_4glte_250_vovi_250_200_125";
		break;

	case "p1000" :
		servicename = "access_3g_200";
		break;
	case "p1001" :
		servicename = "access_4g_300";
		break;
	case "p1002" :
		servicename = "access_4g_250";
		break;
	case "p1003" :
		servicename = "access_4glte_250";
		break;
	case "p1004" :
		servicename = "access_4glte_300";
		break;
	case "p1005" :
		servicename = "voice_200";
		break;
	case "p1006" :
		servicename = "video_200";
		break;
	case "p1007" :
		servicename = "video_250";
		break;
	case "p1008" :
		servicename = "voice_video_250";
		break;
	case "p1009" :
		servicename = "voice_video_300";
		break;
	case "p1010" :
		servicename = "id_200_125";
		break;
	case "p1011" :
		servicename = "id_200_175";
		break;
	case "p1012" :
		servicename = "id_250_225";
		break;
	case "p1013" :
		servicename = "id_300_225";
		break;
	case "p1014" :
		servicename = "id_300_275";
		break;
	
	}
     return servicename;
   }

}
