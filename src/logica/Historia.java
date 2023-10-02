package logica;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import interfaz.Main;

public class Historia {
	
	private String titulo;

	public Historia(String titulo) {
		super();
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Historia [titulo=" + titulo + "]";
	}

	public void Intro1(Jugador jugador, Aliado moon, Aliado mercury, Aliado mars, Aliado jupiter, Aliado venus) {
		JOptionPane.showMessageDialog(null, "Ya es casi la hora.\nTengo que irme ya...", "",  
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "", "",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("acto0.jpg")));
		JOptionPane.showMessageDialog(null, "Hoy es un día muy emocionante para todos:\nel rarísimo eclipse anular está a punto de ocurrir.\nAl igual que vos, muchos se están reuniendo\nen el Parque Yoyogi para presenciar el fenómeno.\nEn el camino, alguien acaba chocándote.", 
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("yoyogi.jpg")));
	}
	
	public void Intro2(Personaje personaje, Jugador jugador, Aliado moon, Aliado mercury, Aliado mars, Aliado jupiter, Aliado venus) {
		JOptionPane.showMessageDialog(null, venus.getNombre() + ":\nMucho gusto, " + personaje.getNombre() + ".\nYo soy Minako, pero puedes llamarme Mina.\nEsta es Makoto.", 
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("Mina.png")));

		if (jupiter.getAfinidad()>3) {
			JOptionPane.showMessageDialog(null, jupiter.getNombre() + ":\nPuedes llamarme Mako.\n¿No tienes compañía?", 
					"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(), 
					JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("Mako.png")));
		} else {
			JOptionPane.showMessageDialog(null, jupiter.getNombre() + ":\nBueno, tenemos que irnos ahora.", 
					"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  
					JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("Mako.png")));
			JOptionPane.showMessageDialog(null, venus.getNombre() + ":\nEspera… ¿no tienes compañía?", 
					"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
					JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("Mina.png")));
		}
	}
	
	public void Escena1(Jugador jugador, Aliado moon, Aliado mercury, Aliado mars, Aliado jupiter, Aliado venus, Personaje personaje, boolean decision, String icoPlayer) {	
		if (decision) {
			JOptionPane.showMessageDialog(null, "Sigues a Mina y Mako por el parque\nhasta que encuentras un grupo de personas\nhaciendo un picnic en el césped.\nVes a dos chicas peleando cuando llegas.",
					"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
					JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
			JOptionPane.showMessageDialog(null, mars.getNombre() + ":\nUsagi!\nQuedamos en esperar a que lleguen todos para comer.",
					"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
					JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("Rei.png")));
			JOptionPane.showMessageDialog(null, moon.getNombre() + ":\n¡¡Buuuwaa!!\n¡Rei, eres mala!\n¿¡No ves que me muero de hambre!?",
					"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
					JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("Usagi.png")));
			JOptionPane.showMessageDialog(null, "Mamoru:\nUsako, ten paciencia.",
					"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
					JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("mamoru.png")));
			JOptionPane.showMessageDialog(null, moon.getNombre() + ":\n¿Tú también, mamo-chan?💔",
					"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
					JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("Usagi.png")));
			JOptionPane.showMessageDialog(null, jupiter.getNombre() + ":\n¡Oooooi!\n¡Nosotros estamos acá!",
					"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
					JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("Mako.png")));
			JOptionPane.showMessageDialog(null, mercury.getNombre() + ":\n¡Por fin llegaron!",
					"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
					JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("Ami.png")));
			JOptionPane.showMessageDialog(null, moon.getNombre() + ":\nOh, ¿eso significa que podemos comer ahora?",
					"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
					JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("Usagi.png")));
			JOptionPane.showMessageDialog(null, "Rei mira a Usagi con cara de desaprobación.",
					"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
					JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("reirp1.png")));
			JOptionPane.showMessageDialog(null, moon.getNombre() + ":\nSolo estaba bromeando.\n¡Ah, ja, ja! ¡Ah, ja, ja! ¡Ah, ja, ja!",
					"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
					JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("Usagi.png")));
			JOptionPane.showMessageDialog(null, mercury.getNombre() + ":\n¿Quien es esta persona con ustedes?",
					"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
					JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("Ami.png")));
			JOptionPane.showMessageDialog(null, venus.getNombre() + ":\nAh, es " + personaje.getNombre() + ". Acabamos de nos conocer.\n" + personaje.getNombre() + ", estas son Rei, Ami y Usagi.\nAh, y este es Mamoru, el novio de Usagi.",
					"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
					JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("Mina.png")));
			JOptionPane.showMessageDialog(null, jupiter.getNombre() + ":\nUsagi es la única de nosotros que tiene novio...",
					"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
					JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("Mako.png")));
			JOptionPane.showMessageDialog(null, mars.getNombre() + ":\nSólo la cabeza hueca...",
					"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
					JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("Rei.png")));
			JOptionPane.showMessageDialog(null, moon.getNombre() + ":\nOye, ¿cómo me llamaste?",
					"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
					JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("Usagi.png")));
			JOptionPane.showMessageDialog(null, "Te preguntas si siempre son así…",
					"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
					JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource(icoPlayer)));
			JOptionPane.showMessageDialog(null, mercury.getNombre() + ":\n¡Chicas, miren!\n¡El evento está por comenzar!",
					"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
					JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("Ami.png")));
			JOptionPane.showMessageDialog(null, moon.getNombre() + ":\n¡No he comido nada todavía!",
					"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
					JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("Usagi.png")));
		} else {
			JOptionPane.showMessageDialog(null, "Desde lejos, ves a Mina y Mako unirse a un grupo de personas que hacen un picnic en el césped del parque.\nParecen llevarse bien, aunque dos de ellos estuvieron discutiendo antes.\nSientes algo fuerte cuando los miras y te preguntas si tal vez no deberías haber ido con ellos.\nNo hay tiempo para arrepentimientos ahora, el espectáculo está por comenzar.",
					"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
					JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		}
	}
	
	public void Escena2(Jugador jugador, Aliado moon, Aliado mercury, Aliado mars, Aliado jupiter, Aliado venus, Enemigo enemigo, Personaje personaje) {	
		JOptionPane.showMessageDialog(null, "El día comienza a convertirse en noche\nmientras observas la luna ponerse frente al sol.\nPoco a poco, el sol se va convirtiendo\nen un anillo de fuego.\nSe escucha a la gente exclamando sorprendida,\nestán tratando de grabar el evento.\nPero pronto las exclamaciones\nse convierten en bostezo.\nNotas que la gente a tu alrededor se desmaya.",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("eclipse.jpg")));
		JOptionPane.showMessageDialog(null, "Mamoru:\nAlgo anda mal.",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("mamoru.png")));
		JOptionPane.showMessageDialog(null, mars.getNombre() + ":\n¿Qué les está pasando a estas personas?",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("Rei.png")));
		JOptionPane.showMessageDialog(null, venus.getNombre() + ":\nTodos se durmieron de repente.",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("Mina.png")));
		JOptionPane.showMessageDialog(null, mercury.getNombre() + ":\n ¡Hay alguien ahí!",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("Ami.png")));
		JOptionPane.showMessageDialog(null, "Miras hacia dónde Ami señaló.\nComo si viniera de la luna, la silueta de alguien aparece flotando allí.",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, mars.getNombre() + ":\n ¿Será un nuevo enemigo?",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("Rei.png")));
		JOptionPane.showMessageDialog(null, moon.getNombre() + ":\n Chicas, transfórmense.",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("Usagi.png")));
		JOptionPane.showMessageDialog(null, jupiter.getNombre() + ":\n Pero Usagi...",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("Mako.png")));
		JOptionPane.showMessageDialog(null, "Las chicas te miran.\nTodos sucumbieron al sueño, excepto vos y este grupo de personas\nque ahora te miran fijamente sin saber qué hacer.",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		
		if (jugador.getGenero().equals("Male")) {
			JOptionPane.showMessageDialog(null, mercury.getNombre() + ":\n ¿No es extraño que el no se desmayara como los demás?",
					"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
					JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("Ami.png")));
		} else {
			JOptionPane.showMessageDialog(null, mercury.getNombre() + ":\n ¿No es extraño que ella no se desmayara como los demás?",
					"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
					JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("Ami.png")));
		}
		
		JOptionPane.showMessageDialog(null, "Una voz viene detrás de todos:\n“¡Chicas! ¡No tenemos tiempo que perder!\" ",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, venus.getNombre() + ":\n ¿¡Artemis!?",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("Mina.png")));
		JOptionPane.showMessageDialog(null, "Notas que la voz provenía de un gato blanco que acaba de llegar,\ny pronto otro gato de pelaje oscuro también comienza a hablar:",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "Luna:\nNo se preocupen por eso.\nTengo una suposición...\n\n¡Transformense ahora mismo!",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("luna.png")));
		JOptionPane.showMessageDialog(null, "Las chicas asienten con la cabeza hacia los gatos.\nCada una comienza a gritar por un planeta y pronto sus cuerpos\nson envueltos por una luz que las transforma en guerreras.\nAunque te sorprenda, sientes algo extrañamente familiar en todo esto.",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("allmakeup.png")));
		
		moon.Transformacion(true); mercury.Transformacion(true); mars.Transformacion(true); jupiter.Transformacion(true); venus.Transformacion(true);
		
		JOptionPane.showMessageDialog(null, moon.getNombre() + ":\n ¡Detente ahí!\n¿Cómo te atreves a interrumpir un momento tan sublime\npara la gente que vino a este parque a relajarse?\n¡Y hasta arruinaste mi comida!",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("moonrp2.png")));
		JOptionPane.showMessageDialog(null, moon.getNombre() + ":\n Soy Sailor Moon, la hermosa guerrera disfrazada de marinera\nque lucha por el amor y la justicia.\n¡Te castigaré en nombre de la luna!",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("moonrp4.png")));
		JOptionPane.showMessageDialog(null, "???:\n ¿Castigarme? Que curioso…\nporque vine aquí precisamente para castigarte…\na ti.",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("darkmoon.png")));
		JOptionPane.showMessageDialog(null, mercury.getNombre() + ":\n ¡Es ella quien está emitiendo ondas de sueño!",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("mercrp12.png")));
		JOptionPane.showMessageDialog(null, jupiter.getNombre() + ":\n ¿Quién eres tú para castigarnos?",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("juprp5.png")));
		JOptionPane.showMessageDialog(null, "???:\n ¿¡No saben quién soy!?",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("darkmoon.png")));
		JOptionPane.showMessageDialog(null, "La figura se acerca, aún flotando en el aire.\nPuedes verlo mejor ahora.\nSu traje es grotesco y se te pone la piel de gallina al mirarla.",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("dmoonfight.png")));
		JOptionPane.showMessageDialog(null, enemigo.getNombre() + ":\n Soy la emperatriz de la luna oscura, Nyx.",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("darkmoon.png")));
		JOptionPane.showMessageDialog(null, "Todo el mundo está asustado por la presentación.",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, venus.getNombre() + ":\n ¡Eso no es verdad!\nLa luna solo tiene una gobernante.",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("venusrp1.png")));
		JOptionPane.showMessageDialog(null, "Artemis:\nDurante mucho tiempo hubo rumores de\nuna emperatriz antes de la Queen Serenity.",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("artrp1.png")));
		JOptionPane.showMessageDialog(null, "Luna:\nEsto es tan viejo que ya nadie lo recuerda.",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("lunarp1.png")));
		JOptionPane.showMessageDialog(null, moon.getNombre() + ":\n ¿Pero por qué lastimas a la gente?",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("moonrp11.png")));
		JOptionPane.showMessageDialog(null, enemigo.getNombre() + ":\n ¡Porque te desprecio!",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("darkmoon.png")));
		JOptionPane.showMessageDialog(null, "En un movimiento rápido, Nyx se acerca\ny comienza a estrangular a Sailor Moon.\nTodos exclaman asustados.\nTienes ganas de ayudarla, pero no sabes cómo.",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "Luna:\nEsta aura…",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("luna.png")));
		JOptionPane.showMessageDialog(null, "Luna no deja de mirarte,\nincluso cuando todos están preocupados por Sailor Moon.",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
	}
	
	public void Escena3(Jugador jugador, Aliado moon, Aliado mercury, Aliado mars, Aliado jupiter, Aliado venus, Personaje personaje, Enemigo enemigo, String icoPlayer) {
		JOptionPane.showMessageDialog(null, "Tuxedo Mask:\nLa gente duerme para tener buenos sueños,\n¡pero tú los convertiste en pesadillas!\n¡Sailor Moon, ahora!",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("tmask.png")));
		JOptionPane.showMessageDialog(null, moon.getNombre() + ":\n No sé por qué hiciste esto,\npero no puedo permitir que sigas lastimando a la gente.",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("moonrp3.png")));
		JOptionPane.showMessageDialog(null, "", "Curación Lunar ¡Acción!",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("mooncure.gif")));
		JOptionPane.showMessageDialog(null, enemigo.getNombre() + ":\n Tonta.",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("darkmoon.png")));
		JOptionPane.showMessageDialog(null, "Con un simple movimiento, Nyx desvía el golpe\ny este viene hacia ti.",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "Todos:\n¡Eso no!",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "Sientes un aura fuerte que rodea tu cuerpo cuando te golpea.\nDerrepente, todo tu cuerpo brilla.",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "Luna:\nEs como sospechaba.\n¡Rápido, pídele a la Tierra que te despierte!",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("lunarp1.png")));
		JOptionPane.showMessageDialog(null, "'Despiértame…?' Las palabras te confunden.\nRecordando cómo se transformaron las chicas, haces lo mismo:\n“¡Por ​​el poder del planeta Tierra, despiértame!”\nY pronto su ropa da paso a un traje de combate.",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource(icoPlayer)));
		
		personaje.Transformacion(true);
		
		JOptionPane.showMessageDialog(null, "Todas las chicas:\n¡No es posible!",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "Luna:\n¡Tal como lo imaginaba!",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("luna.png")));
		JOptionPane.showMessageDialog(null, "Artemis:\nPensé que era sólo un mito...",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("artemis.png")));
		JOptionPane.showMessageDialog(null, enemigo.getNombre() + ":\nAsí que ahí estás...",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("darkmoon.png")));
		JOptionPane.showMessageDialog(null, "Luna:\n¡Necesitamos tu ayuda!\nPero todavía no sabes luchar...",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("luna.png")));
	}
	
	public void Escena4(Jugador jugador, Aliado moon, Aliado mercury, Aliado mars, Aliado jupiter, Aliado venus, Enemigo enemigo) {
		JOptionPane.showMessageDialog(null, "En ese momento, Sailor Moon se desmaya frente a todos, causando preocupación.\nTuxedo Mask la toma en sus brazos y se da cuenta de que todavía está viva,\npero su cuerpo está frío como la noche.",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, mars.getNombre() + ":\n¿Por qué haces esto?",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("marsrp6.png")));
		JOptionPane.showMessageDialog(null, enemigo.getNombre() + ":\nEso es lo que se merecen por encerrarme\nen la oscuridad durante tanto tiempo.",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("darkmoon.png")));
		JOptionPane.showMessageDialog(null, jupiter.getNombre() + ":\n¡Eso no tiene sentido!\nNunca nos habíamos conocido antes.",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("juprp4.png")));
		JOptionPane.showMessageDialog(null, enemigo.getNombre() + ":\nEste mundo todavía está sucio.\nPronto se pudrirá.\nY perecerás junto con él.",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "Antes de que alguien pueda decir algo,\nla figura de Nyx se eleva hacia el cielo,\ndesapareciendo de la misma manera que apareció.\nEl eclipse se está terminando.",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "Luna:\nChicos...\nHa llegado el momento de que conozcan\nla historia de Dark Moon y Sailor Earth.",
				"Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),
				JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("luna.png")));
	}
	
	public void finDemo(Aliado moon, Aliado mercury, Aliado mars, Aliado jupiter, Aliado venus) {
		moon.Transformacion(false); mercury.Transformacion(false); mars.Transformacion(false); jupiter.Transformacion(false); venus.Transformacion(false);
		int max = -100;
		String nomMax = "";
		
		if (max<=moon.getAfinidad()) {
			max = moon.getAfinidad();
			nomMax = moon.getNombre();
		}
		
		if (max<=mercury.getAfinidad()) {
			max = mercury.getAfinidad();
			nomMax = mercury.getNombre();
		}
		
		if (max<=mars.getAfinidad()) {
			max = mars.getAfinidad();
			nomMax = mars.getNombre();
		}
		
		if (max<=jupiter.getAfinidad()) {
			max = jupiter.getAfinidad();
			nomMax = jupiter.getNombre();
		}
		
		if (max<=venus.getAfinidad()) {
			max = venus.getAfinidad();
			nomMax = venus.getNombre();
		}
		
		//controlar os empates
		
		String img = nomMax + ".png";
		JOptionPane.showMessageDialog(null, "¡Gracias por jugar la demostración del juego!\nFormaste un vínculo especial con " + nomMax + ".\nEspero que estés listo para aventurarte con ella\nen esta nueva aventura de Sailor Moon.", "Fin de la Demo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource(img)));
		JOptionPane.showMessageDialog(null, "Sailor Moon: Battle for Earth\n¡Próximamente!", "Fin de la Demo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
	}
	
	
	
	
	
	
	
	
	

}

//JOptionPane.showMessageDialog(null, "", "Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
//JOptionPane.showMessageDialog(null, "", "Karma: " + jugador.getKarma() + " | Afinidad: ☽" + moon.getAfinidad() + " ☿" + mercury.getAfinidad() + " ♂" + mars.getAfinidad() + " ♃" + jupiter.getAfinidad() + " ♀" + venus.getAfinidad(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
