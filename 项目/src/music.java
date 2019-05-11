import java.util.Scanner;

import javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler;


public class music {

	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int music1=0;//主页选择
		int put;//返回上级菜单
		String[]phones={null,null,null,null,null,null,null,null,null,null};//注册用户名
		String []miMas={null,null,null,null,null,null,null,null,null,null};;//注册密码
		boolean loginFlag=false;
		String phone = null;//注册用的手机号
		String mima=null;//注册用的密码
		int faxian=0;  //发现音乐选择按钮
		String faxin;//发现歌曲选择按钮
		String[]faput={"心安里得","庸人自扰","走天涯","我对着自己开了一枪","光年之外","刚刚好","初恋旧爱新欢",null,null,null};
		String[]xihuans={"生而为人-尚士达","幻听-许嵩","桥逗麻袋-陈粒","演员-薛之谦","天真有邪-林宥嘉",null,null,null,null,null};
		String[]friends={"大菠萝h","石攸傻","kitu","小满在远方等你",null,null,null,null,null};
		int xindong=0;//播放心动音乐
		int jizhan=0;//音基站
		int friend=0;//添加好友选
		int xindong_;//添加心动音
		boolean f=false;
		String vip;

		do{
			System.out.println("				音music					");
			System.out.println("************************************************************");
			System.out.println("\n主页");
			System.out.println("\n\t1.账号注册");
			System.out.println("\t2.登录音music");
			System.out.println("\t3.发现音乐");
			System.out.println("\t4.本地音乐");
			System.out.println("\t0.退出");
			System.out.println("				-----远东韵律-张艺兴----											");
			System.out.println("     		 	   &&上一曲             ||     	下一曲&&");
			System.out.println();
			System.out.println();
			System.out.println("____________________________________________________________");
			System.out.print("阁下请选择：");
			music1=input.nextInt();
			switch(music1){
				case 1:
					System.out.println("注册页面");
					do{
						System.out.print("\t请输入您的手机号:");
						 phone=input.next();
						if (phone.length()==11){
							break;
						}else {
							System.out.println("\t手机号格式不正确");
						}
					}while(true);
					//输入密码
					System.out.print("\t请输入您的密码:");
					mima=input.next();
					int i=0;
					for (; i < phones.length; i++) {
						if(phones[i]==null){
							phones[i]=phone;
							miMas[i]=mima;
							System.out.println("注册成功");
							break;
						}
					}
					if(i==phones.length){
						System.out.println("注册失败,满了");
					}
					continue;	
				case 2:
					//登录
					do{
						System.out.print("\t用户名(手机号码/中国大陆+86):");
						phone=input.next();
						System.out.println("\t");
						System.out.print("\t请输入您的密码:");
						mima=input.next();
						int phone_index=-1;
						for (int j = 0; j < miMas.length; j++) {
							if(phones[j]!=null&&phones[j].equals(phone)){
								phone_index=j;
								break;
							}
						}
						
							if(phone_index==-1){
								System.out.print("手机号不存在(小贴士:如无账号可输入0返回上级菜单)");
								put=input.nextInt();
								if (put==0) {
									break;
									
								}
								continue;
							}else if(miMas[phone_index].equals(mima)){
								System.out.println("登录成功");
								 loginFlag=true;
								 break;
							}else{
								System.out.println("密码不正确");
								continue;
							}
						}while(true);
					continue;
				case 0:
					System.out.println("输入错误");
					break;
				case 3: 
					 if(!loginFlag){
						 System.out.println("请先登录");
					 }else{
						 do{
							 System.out.println("	**********************");		 
							System.out.println("发现音乐页面");
							System.out.println("\n\t1.	心动音乐");
							System.out.println("\n\t2.	音基站");
							System.out.println("\n\t3.	发现音乐");
							System.out.println("\n\t4.	黑胶VIP");
							System.out.println("\n\t0.	返回上级菜单");
							System.out.println("	**********************");	
							System.out.print("请选择(输入0返回):");
							
							 faxian=input.nextInt();
							 switch (faxian) {
							case 1://心动音乐
								System.out.println("\n.心动音乐页面");
								do{
									for (int j = 0; j < xihuans.length; j++) {
										if (xihuans[j]!=null) {
											System.out.println("\n\t"+(j+1)+":❤"+xihuans[j]);
										}
										
											}
										System.out.print("播放歌曲(输入0退出):");
										xindong=input.nextInt();
										switch(xindong){
										 case 1:
											 System.out.println("				----生而为人-尚士达-----											");
												System.out.println("     		 	   &&上一曲             ||     	下一曲&&");
												continue;
										 case 2:
											 System.out.println("				----幻听-许嵩-----											");
												System.out.println("     		 	   &&上一曲             ||     	下一曲&&");
												continue;
										 case 3:
											 System.out.println("				----桥逗麻袋-陈粒-----											");
												System.out.println("     		 	   &&上一曲             ||     	下一曲&&");
												continue;
										 case 4:
											 System.out.println("				-----演员-薛之谦----											");
												System.out.println("     		 	   &&上一曲             ||     	下一曲&&");
												continue;
										 case 5:
											 System.out.println("				-----天真有邪-林宥嘉----											");
												System.out.println("     		 	   &&上一曲             ||     	下一曲&&");
											 continue;
										 case 0:
											 System.out.println("退出");
											 break;
										default:
											System.out.println("输入有误");
											continue;
										}
										break;
									}while(true);	
								continue;
							case 2:
								do{
									System.out.println("\n2.音基站页面");//音基站界面
									System.out.print("			1.我的好友	");
									System.out.print("2.云空间");
									System.out.println();
									System.out.println("请选择(输入0返回):");
									System.out.println("_______________________________________________");
									jizhan=input.nextInt();
									switch (jizhan) {
									case 1:
										System.out.println("我的好友界面");//展示我现有的好友
										for (int j = 0; j < friends.length; j++) {
											if (friends[j]!=null) {
												System.out.println("\n\t"+friends[j]);
											}
										}
										System.out.println("**************************************");
										continue;
									case 2:
										do{
											boolean falg=false;
											System.out.println("云空间界面");//展示现有的云空间
											System.out.println("\n\t名侦探怪盗基德--分享单曲");
											 System.out.println("				-----我曾-隔壁老樊----											");
											 System.out.println("\n\t夜晚很美--分享单曲");
											 System.out.println("				-----谁-廖俊涛----											");
											 System.out.println("\n\t枷锁--分享单曲");
											 System.out.println("				-----通透-陈亦云----											");
											 System.out.print("添加好友吗?[请输入数值(输入0键返回上级)]");//添加好友菜单
											 friend=input.nextInt();
											 switch (friend) {
											case 1:
												for (int j = 0; j < friends.length; j++) {
													if (friends[j]==null) {
														friends[j]="名侦探怪盗基德";
														falg=true;
														break;
													}
													
												}
												if (falg) {
													System.out.println("已添加好友[名侦探怪盗基德]");
												}else {
													System.out.println("添加失败,满了");
												}
												continue;
											case 2:
												for (int j = 0; j < friends.length; j++) {
													if (friends[j]==null) {
														falg=true;
														friends[j]="夜晚很美";
														break;
													}
												}
												if (falg) {
													System.out.println("已添加好友[夜晚很美]");
												}else {
													System.out.println("添加失败,满了");
												}
												continue;
											case 3:
												for (int j = 0; j < friends.length; j++) {
													if (friends[j]==null) {
														friends[j]="枷锁";
														falg=true;
														break;
													}
												}
												if (falg) {
													System.out.println("已添加好友[枷锁]");
												}else {
													System.out.println("添加失败,满了");
												}
												continue;
											case 0:
												break;
												
											default:
												System.out.println("输入有误☼");
												continue;
											}
											
											 break;
										}while(true);
										continue;
									case 0:
										
										break;
									default:
										continue;
									}
									break;
								}while(true);
								continue;
							case 3:
									System.out.println("\n3.发现音乐页面");
									System.out.println("_________________________________________");
								
										do{
										System.out.println("发现歌曲页面:");//发现歌手
										for (int j = 0; j < faput.length; j++) {
											if (faput[j]!=null) {
												System.out.println("\t\n"+faput[j]);
												
											}
										}
										System.out.print("是否播放歌曲或者添加心动音乐(y/n)按0键返回:");
									
										faxin=input.next();
										if (faxin.equals("y")) {
										
												System.out.print("播放歌曲:");
												xindong=input.nextInt();
												switch (xindong) {
												case 1:
													 System.out.println("				----心安里得-----											");
														System.out.println("     		 	   &&上一曲             ||     	下一曲&&");
													continue;
												case 2:
													 System.out.println("				----庸人自扰-----											");
														System.out.println("     		 	   &&上一曲             ||     	下一曲&&");
													continue;
												case 3:
													 System.out.println("				----走天涯-----											");
														System.out.println("     		 	   &&上一曲             ||     	下一曲&&");
													continue;
												case 4:
													 System.out.println("				----我对着自己开了一枪-----											");
														System.out.println("     		 	   &&上一曲             ||     	下一曲&&");
													continue;
												case 5:
													 System.out.println("				----光年之外----											");
														System.out.println("     		 	   &&上一曲             ||     	下一曲&&");
													continue;
												case 6:
													 System.out.println("				----刚刚好-----											");
														System.out.println("     		 	   &&上一曲             ||     	下一曲&&");
													continue;
												case 7:
													 System.out.println("				----初恋旧爱新欢-----											");
														System.out.println("     		 	   &&上一曲             ||     	下一曲&&");
													continue;
												case 0:
													break;
												}
											
										}else if (faxin.equals("n")) {
											do{
											System.out.print("请问添加哪首歌曲:");//添加心动音乐
											xindong_=input.nextInt();
											switch (xindong_) {
											case 1:
												for (int j = 0; j < xihuans.length; j++) {
													if (xihuans[j]==null) {
														xihuans[j]="心安理得";
														f=true;
														break;
													}
													
												}
												if (f) {
													System.out.println("心安理得已添加至心动歌曲");
												}else{
													System.out.println("心动页面已载满,失败!");
												}
												
												continue;
											case 2:
												for (int j = 0; j < xihuans.length; j++) {
													if (xihuans[j]==null) {
														xihuans[j]="❤庸人自扰";
														f=true;
														break;
													}
													
												}
												if (f) {
													System.out.println("	庸人自扰已添加至心动歌曲");
												}else{
													System.out.println("心动页面已载满,失败!");
												}
												continue;
											case 3:
												for (int j = 0; j < xihuans.length; j++) {
													if (xihuans[j]==null) {
														xihuans[j]="❤走天涯";
														f=true;
														break;
													}
													
												}
												if (f) {
													System.out.println("	走天涯已添加至心动歌曲");
												}else{
													System.out.println("心动页面已载满,失败!");
												}
												continue;
											case 4:
												for (int j = 0; j < xihuans.length; j++) {
													if (xihuans[j]==null) {
														xihuans[j]="❤我对着自己开了一枪";
														f=true;
														break;
													}
													
												}
												if (f) {
													System.out.println("	我对着自己开了一枪已添加至心动歌曲");
												}else{
													System.out.println("心动页面已载满,失败!");
												}
												continue;
											case 5:
												for (int j = 0; j < xihuans.length; j++) {
													if (xihuans[j]==null) {
														xihuans[j]="❤光年之外";
														f=true;
														break;
													}
													
												}
												if (f) {
													System.out.println("	光年之外已添加至心动歌曲");
												}else{
													System.out.println("心动页面已载满,失败!");
												}
												continue;
											case 6:
												for (int j = 0; j < xihuans.length; j++) {
													if (xihuans[j]==null) {
														xihuans[j]="❤刚刚好";
														f=true;
														break;
													}
													
												}
												if (f) {
													System.out.println("	刚刚好已添加至心动歌曲");
												}else{
													System.out.println("心动页面已载满,失败!");
												}
												continue;
											case 7:
												for (int j = 0; j < xihuans.length; j++) {
													if (xihuans[j]==null) {
														xihuans[j]="❤初恋旧爱新欢";
														f=true;
														break;
													}
													
												}
												if (f) {
													System.out.println("	初恋旧爱新欢已添加至心动歌曲");
												}else{
													System.out.println("心动页面已载满,失败!");
												}
												continue;
											case 0:
												break;
											default:
												System.out.println("无此歌曲");
												continue;
											}
											break;
											}while(true);
											continue;
										}else if (faxin.equals("0")) {
											break;
										} 
									break;
									}while (true) ;
								continue;
							case 4:
								System.out.println("\n4.黑胶ViP页面");
								System.out.println("		开通黑胶Vip可试听爱豆的新专辑哟!");
								System.out.println("__________________________________________________");
							
									System.out.println("	1.月vip/15元		2.季度vip/45元       3.年度vip/218元");
									System.out.print("开通吗?(y/n)");
									 vip=input.next();
									if (vip.equals("y")) {
										System.out.print("请输入您选择开通的类型:");
										int a=input.nextInt();
										System.out.print("请选择该类型的购买数量:");
										int b=input.nextInt();
										boolean c=false;
										switch (a) {
										case 1:
											c=true;
											int a1=15;
											double sum=a1*b;
											System.out.println("您需要支付的金额为:"+sum+"元");
											System.out.println("您已成功购买月度vip"+b+"份");
											break;
										case 2:
											c=true;
											int a2=45;
											double sun=a2*b;
											System.out.println("您需要支付的金额为:"+sun+"元");
											System.out.println("您已成功购买季度vip"+b+"份");
											break;
										case 3:
											c=true;
											int a3=218;
											double sui=a3*b;
											System.out.println("您需要支付的金额为:"+sui+"元");
											System.out.println("您已成功购买年度vip"+b+"份");
											break;
									
										}
									}
								continue;
							case 0:
								break;
							default:
								continue;
							}
							 break;
						 
						}while(true);
						
					 }		
					continue;

				case 4:
					//本地音乐
					System.out.println("无本地音乐(是否搜索本地音乐y/n)");
					continue;
				default:
					System.out.println("輸入錯誤,請重新輸入!!!");
					continue;
			}
			break;
		}while(true); 
		
	}
}

			
				
		
								