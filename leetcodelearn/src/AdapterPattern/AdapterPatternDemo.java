package AdapterPattern;
//1��ϵͳ��Ҫʹ�����е��࣬������Ľӿڲ�����ϵͳ����Ҫ�� 
//2����Ҫ����һ�������ظ�ʹ�õ��࣬������һЩ�˴�֮��û��̫�������һЩ�࣬����һЩ�����ڽ�����������һ��������ЩԴ�಻һ����һ�µĽӿڡ� 
//3��ͨ���ӿ�ת������һ���������һ����ϵ�С��������ϻ��ͷ��ݣ����ڶ���һ���ɻ����ڲ�����ʵ��������£�����һ�������������������һ��������ʵ�ַɵĽӿڡ��� 
public class AdapterPatternDemo {
	   public static void main(String[] args) {
	      AudioPlayer audioPlayer = new AudioPlayer();

	      audioPlayer.play("mp3", "beyond the horizon.mp3");
	      audioPlayer.play("mp4", "alone.mp4");
	      audioPlayer.play("vlc", "far far away.vlc");
	      audioPlayer.play("avi", "mind me.avi");
	   }
	}