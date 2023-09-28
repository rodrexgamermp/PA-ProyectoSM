package logica;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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

	public void Decision1(Aliado aliado, Jugador jugador) {
		String[] respuesta = {"Todo bien, no te preocupes.", "¡Ten más cuidado!"};
		
		 int opcion = JOptionPane.showOptionDialog(
		            null,
		            aliado.getNombre() + ":\nLo siento. ¿Estás bien?",
		            "Decision",
		            JOptionPane.DEFAULT_OPTION,
		            JOptionPane.PLAIN_MESSAGE,
		            null,
		            respuesta,
		            respuesta[0]
		        );

		        if (opcion == 0) {
		        	aliado.modAfinidad(true);
		        	jugador.calcularKarma(true, 1);
		        	JOptionPane.showMessageDialog(null, aliado.getNombre() + ":\nAh, me alegro. Estaba distraída…", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("makorelief.jpg")));
		        } else {
		        	aliado.modAfinidad(false);
		        	jugador.calcularKarma(false, 1);
		        	JOptionPane.showMessageDialog(null, aliado.getNombre() + ":\nTampoco es para tanto. Estaba distraída…", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("makoangry.jpg")));
		        }

	}
	
	public boolean Decision2(Aliado aliado, Jugador jugador) {
		String[] respuesta = {"¡Me encantaría!", "Sería genial, pero…"};
		
		 int opcion = JOptionPane.showOptionDialog(
		            null,
		            "¿No te gustaría venir con nosotros?",
		            "Decision",
		            JOptionPane.DEFAULT_OPTION,
		            JOptionPane.PLAIN_MESSAGE,
		            null,
		            respuesta,
		            respuesta[0]
		        );

		        if (opcion == 0) {
		        	aliado.modAfinidad(true);
		        	jugador.calcularKarma(true, 1);
		        	JOptionPane.showMessageDialog(null, aliado.getNombre() + ":\n¡Entonces vámonos!\nNuestros amigos ya nos están esperando.", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("minasmart.jpg")));
		            return true;
		        } else {
		        	aliado.modAfinidad(false);
		        	jugador.calcularKarma(false, 1);
		        	JOptionPane.showMessageDialog(null, aliado.getNombre() + ":\nOh, ya debes tener otros planes.\nTodo bien entonces. ¡Nos vemos por ahí!", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("minashame.jpg")));
		            return false;
		        }

	}
	
	public void Escena1(boolean decision, Personaje personaje) {	
		if (decision) {
			JOptionPane.showMessageDialog(null, "Sigues a Mina y Mako por el parque\nhasta que encuentras un grupo de personas\nhaciendo un picnic en el césped.\nVes a dos chicas peleando cuando llegas.", "Narración",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
			JOptionPane.showMessageDialog(null, "Rei:\nUsagi!\nQuedamos en esperar a que lleguen todos para comer.", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("reiadvert.png")));
			JOptionPane.showMessageDialog(null, "Usagi:\n¡¡Buuuwaa!!\n¡Rei, eres mala!\n¿¡No ves que me muero de hambre!?", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("usadrama.jpg")));
			JOptionPane.showMessageDialog(null, "Mamoru:\nUsako, ten paciencia.", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("mamosoft.jpg")));
			JOptionPane.showMessageDialog(null, "Usagi:\n¿Tú también, mamo-chan?💔", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("usacry.png")));
			JOptionPane.showMessageDialog(null, "Mako:\n¡Oooooi!\n¡Nosotros estamos acá!", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("makomina.jpg")));
			JOptionPane.showMessageDialog(null, "Ami:\n¡Por fin llegaron!", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("amisign.jpg")));
			JOptionPane.showMessageDialog(null, "Usagi:\nOh, ¿eso significa que podemos comer ahora?", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("usaeat.png")));
			JOptionPane.showMessageDialog(null, "Rei mira a Usagi con cara de desaprobación.", "Narración",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("reiglare.jpg")));
			JOptionPane.showMessageDialog(null, "Usagi:\nSolo estaba bromeando.\n¡Ah, ja, ja! ¡Ah, ja, ja! ¡Ah, ja, ja!", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("usashame.png")));
			JOptionPane.showMessageDialog(null, "Ami:\n¿Quien es esta con ustedes?", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("amiquestion.jpg")));
			JOptionPane.showMessageDialog(null, "Mina:\nAh, esa es " + personaje.getNombre() + ". La acabamos de conocer.\nEstá sola, así que la invitamos a venir con nosotros.\n" + personaje.getNombre() + ", estas son Rei, Ami y Usagi.\nAh, y este es Mamoru, el novio de Usagi.", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("pjintro.jpg")));
			JOptionPane.showMessageDialog(null, "Mako:\nUsagi es la única de nosotros que tiene novio...", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("makomina2.jpg")));
			JOptionPane.showMessageDialog(null, "Rei:\nSólo la cabeza hueca...", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("reiscam.jpg")));
			JOptionPane.showMessageDialog(null, "Usagi:\nOye, ¿cómo me llamaste?", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("usareifight.jpg")));
			JOptionPane.showMessageDialog(null, "Te preguntas si siempre son así…", "Narración",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("pjsurprise.jpg")));
			JOptionPane.showMessageDialog(null, "Ami:\n¡Chicas, miren!\n¡El evento está por comenzar!", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("amipoint.png")));
			JOptionPane.showMessageDialog(null, "Usagi:\n¡No he comido nada todavía!", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("usasob.jpg")));
		} else {
			JOptionPane.showMessageDialog(null, "Desde lejos, ves a Mina y Mako unirse a un grupo de personas que hacen un picnic en el césped del parque.\nParecen llevarse bien, aunque dos de ellos estuvieron discutiendo antes.\nSientes algo fuerte cuando los miras y te preguntas si tal vez no deberías haber ido con ellos.\nNo hay tiempo para arrepentimientos ahora, el espectáculo está por comenzar.", "Narración",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("smpicnic.jpg")));
		}
	}
	
	public void Escena2(Aliado moon, Aliado mercury, Aliado mars, Aliado jupiter, Aliado venus, Enemigo sun) {	
		JOptionPane.showMessageDialog(null, "El día comienza a convertirse en noche\nmientras observas la luna ponerse frente al sol.\nPoco a poco, el sol se va convirtiendo\nen un anillo de fuego.\nSe escucha a la gente exclamando sorprendida,\nestán tratando de grabar el evento.\nPero pronto las exclamaciones\nse convierten en gritos.\nNotas que la gente a tu alrededor se desmaya.\n“Hace mucho calor”, se oye decir a alguien.", "Narración",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("eclipse.jpg")));
		JOptionPane.showMessageDialog(null, "Mamoru:\nAlgo anda mal.", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("mamotrouble.jpg")));
		JOptionPane.showMessageDialog(null, mars.getNombre() + ":\n¿Qué les está pasando a estas personas?", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, venus.getNombre() + ":\n ¿Soy solo yo o de repente se puso caliente?", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, mercury.getNombre() + ":\n ¡Hay alguien ahí!", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "Miras hacia dónde Ami señaló.\nLa luna ya se aleja del sol, dejando al descubierto la silueta de alguien flotando allí.\nCuando los rayos del sol vuelven a esparcirse por el cielo,\nves a una mujer vestida de naranja, cabello ardiente y ojos rojos.", "Narración",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, mars.getNombre() + ":\n ¿Será un nuevo enemigo?", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, moon.getNombre() + ":\n Chicas, transfórmense.", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, jupiter.getNombre() + ":\n Pero Usagi...", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "Las chicas te miran.\nTodos sucumbieron al calor extremo que apareció de repente,\nexcepto vos y este grupo de personas que ahora te miran fijamente sin saber qué hacer.", "Narración",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, mercury.getNombre() + ":\n ¿No es extraño que ella no se desmayara como los demás?", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "Una voz viene detrás de todos:\n“¡Chicas! ¡No tenemos tiempo que perder!\" ", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, venus.getNombre() + ":\n ¿¡Artemis!?", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "Notas que la voz provenía de un gato blanco que acaba de llegar,\ny pronto otro gato de pelaje oscuro también comienza a hablar:", "Narración",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "Luna:\n No te preocupes por ella.\nSiento un aura muy fuerte…\n\n¡Transfórmate ahora!", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "Las chicas asintieron con la cabeza hacia los gatos.\nLas ves agarrar un objeto especial.\nCada una comienza a gritar por un planeta y pronto sus cuerpos\nson envueltos por una luz que las transforma en guerreras.\nAunque estés sorprendida, sientes algo extrañamente familiar en todo esto.", "Narración",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("s4makeup.jpg")));
		moon.Transformacion(true); mercury.Transformacion(true); mars.Transformacion(true); jupiter.Transformacion(true); venus.Transformacion(true);
		JOptionPane.showMessageDialog(null, moon.getNombre() + ":\n ¡Detente ahí!\n¿Cómo te atreves a interrumpir un momento tan sublime\npara la gente que vino a este parque a relajarse?\n¡Y hasta arruinaste mi comida!", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("smspeech.jpg")));
		JOptionPane.showMessageDialog(null, mars.getNombre() + ":\n No puede ser...", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, moon.getNombre() + ":\n Soy Sailor Moon, la hermosa guerrera disfrazada de marinera\nque lucha por el amor y la justicia.\n¡Te castigaré en nombre de la luna!", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("smpunish.jpg")));
		JOptionPane.showMessageDialog(null, "???:\n ¿Castigarme? Que curioso…\nporque vine aquí precisamente para castigarte…\na ti.", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, mercury.getNombre() + ":\n ¡Los sofocos provienen de ella!", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, jupiter.getNombre() + ":\n ¿Quién eres tú para castigarnos?", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "???:\n ¿No me reconoces?", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "La figura se acerca, aún flotando en el aire.\nPuedes verlo mejor ahora.\nSu disfraz es similar al de las Sailor Guerreras que acaban de transformarse,\nsólo que un poco más sofisticado.\nSe te pone la piel de gallina al mirarla.", "Narración",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("sunhenshi.jpg")));
		JOptionPane.showMessageDialog(null, sun.getNombre() + ":\n Soy la guerrera del sol, Sailor Sun.", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("sunintro.jpg")));
		JOptionPane.showMessageDialog(null, "Todo el mundo está asustado por la presentación.", "Narración",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, venus.getNombre() + ":\n ¡No puede ser!", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "Artemis:\nEs verdad.\nLa Reina Serenity nos lo contó.", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "Luna:\n¿Pero por qué estás aquí?", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, moon.getNombre() + ":\n ¿Y por qué lastimas a la gente?", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, sun.getNombre() + ":\n ¡Porque te desprecio!", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "En un movimiento rápido, Sailor Sun se acerca\ny comienza a estrangular a Sailor Moon.\nTodos exclaman asustados.\nTienes ganas de ayudarla, pero no sabes cómo.", "Narración",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "Luna:\nEsta aura…", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "Luna, la gata de pelaje negro y una cicatriz en forma de luna no deja de mirarte,\nincluso cuando todos están preocupados por Sailor Moon.", "Narración",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
	}
	
	public void Decision3(Jugador jugador) {
		String[] respuesta = {"Busca alguna manera de ayudar.", "Mejor no involucrarse, no hay nada que hacer."};
		
		 int opcion = JOptionPane.showOptionDialog(
		            null,
		           "¿Que haces?",
		            "Decision",
		            JOptionPane.DEFAULT_OPTION,
		            JOptionPane.PLAIN_MESSAGE,
		            null,
		            respuesta,
		            respuesta[0]
		        );

		        if (opcion == 0) {
		        	jugador.calcularKarma(true, 1);
		        	JOptionPane.showMessageDialog(null, "Recoges una piedra para arrojarla al enemigo, pero antes de que puedas hacerlo,\nuna rosa roja cruza el cielo y golpea a Sailor Sun, provocando que libere a Sailor Moon.\nTe das cuenta de que acaba de aparecer un joven con esmoquin y máscara.", "Narración",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("tmatk.jpg")));
		        } else {
		        	jugador.calcularKarma(false, 1);
		        	JOptionPane.showMessageDialog(null, "Afortunadamente, una rosa roja cruza el cielo y golpea a Sailor Sun,\nprovocando que ésta libere a Sailor Moon.\nTe das cuenta de que acaba de aparecer un joven con esmoquin y máscara.", "Narración",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("tmatk.jpg")));
		        }

	}
	
	public void Escena3(Personaje earth, Aliado moon, Enemigo sun) {
		JOptionPane.showMessageDialog(null, "Tuxedo Mask:\nEl sol es fuente de luz y vida para el ser humano.\nNo debería usar sus poderes para el mal.\n¡Sailor Moon, ahora!", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("tmshow.jpg")));
		JOptionPane.showMessageDialog(null, moon.getNombre() + ":\n No sé por qué hiciste esto,\npero no puedo permitir que sigas lastimando a la gente.", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "", "Curación Lunar ¡Acción!",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("smatk.gif")));
		JOptionPane.showMessageDialog(null, sun.getNombre() + ":\n Tonta.", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "Con un simple movimiento, Sailor Sun desvía el golpe\ny este viene hacia ti.", "Narración",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("pjhit.jpg")));
		JOptionPane.showMessageDialog(null, "Todos:\n¡Eso no!", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "Sientes un aura fuerte que rodea tu cuerpo cuando te golpea.\nDerrepente, todo tu cuerpo brilla.", "Narración",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "Luna:\nEs como sospechaba.\n¡Rápido, pídele a la Tierra que te despierte!", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "'Despiértame…?' Estás confundida.\nRecordando cómo se transformaron las niñas, haces lo mismo:\n“¡Por ​​el poder del planeta Tierra, despiértame!”\nY pronto su ropa da paso a un traje de marinero.", "Narración",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("earthmakeup.jpg")));
		earth.Transformacion(true);
		JOptionPane.showMessageDialog(null, "Todas las chicas:\n¡No es posible!", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("earthhenshi.jpg")));
		JOptionPane.showMessageDialog(null, "Luna:\n¡Tal como lo imaginaba!", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "Artemis:\nPensé que era sólo un mito...", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, sun.getNombre() + ":\nNo puedo creer que realmente existas.", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "Luna:\n¡Necesitamos tu ayuda!\nPero no puedes luchar sola.", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
	}
	
	public void batallaTutorial(Personaje earth, Aliado moon, Aliado mercury, Aliado mars, Aliado jupiter, Aliado venus, Enemigo sun, boolean victoria) {
		if (victoria) {
			JOptionPane.showMessageDialog(null, "Luna: Su elección fue satisfactoria, por lo que pudiste atacar al enemigo.\nEsto lo debilita, haciendo más fácil derrotarlo o salvarlo.", "Tutorial",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
			JOptionPane.showMessageDialog(null, "Tuxedo Mask:\nSailor Sun, es el fin.", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
			JOptionPane.showMessageDialog(null, sun.getNombre() + ":\nTienes razón. Es el fin,\npero no para mí.", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));			
		} else {
			JOptionPane.showMessageDialog(null, "Luna: Su elección no fue satisfactoria, por lo que no pudiste atacar al enemigo.\nAnaliza al enemigo y el poder de cada Sailor Guerrera\npara tomar la mejor decisión y debilitar al enemigo.", "Tutorial",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
			JOptionPane.showMessageDialog(null, sun.getNombre() + ":\nAhora es demasiado tarde...", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		}
	}
	
	public void Escena4(Aliado mars, Aliado jupiter, Enemigo sun) {
		JOptionPane.showMessageDialog(null, "En ese momento, Sailor Moon se desmaya frente a todos, causando preocupación.\nTuxedo Mask la toma en sus brazos y se da cuenta de que todavía está viva,\npero su cuerpo arde como si tuviera fiebre alta.\nSailor Sun comienza a reírse.", "Narración",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("smfaint.jpg")));
		JOptionPane.showMessageDialog(null, mars.getNombre() + ":\n¿Por qué haces esto?", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, sun.getNombre() + ":\nEso es lo que se merecen por encerrarme\nen la oscuridad durante tanto tiempo.", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, jupiter.getNombre() + ":\n¡Eso no tiene sentido!\nNunca nos habíamos conocido antes.", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, sun.getNombre() + ":\nEste mundo todavía está sucio.\nPronto se pudrirá.\nY perecerás junto con él.", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "Antes de que alguien pueda decir algo,\nla figura de Sailor Sun se eleva hacia el cielo,\ndesapareciendo de la misma manera que apareció.", "Narración",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
		JOptionPane.showMessageDialog(null, "Luna:\nChicas...\nCreo que además de salvar a Sailor Moon...\nvamos a tener que salvar a Sailor Sun también.", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
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
		JOptionPane.showMessageDialog(null, "¡Gracias por jugar la demostración del juego!\n\nFormaste un vínculo especial con " + nomMax + ".\nEspero que estés listo para aventurarte con ella\nen esta nueva aventura de Sailor Moon.", "Fin de la Demo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource(img)));
		JOptionPane.showMessageDialog(null, "Sailor Moon: Battle for Earth\n\n¡Próximamente!", "Fin de la Demo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("thanks.jpg")));
	}
	
	public String eligirAtaque(Personaje earth, Aliado moon, Aliado mercury, Aliado mars, Aliado jupiter, Aliado venus, Enemigo enemigo) {
		String[] respuesta = {mercury.getNombre(), mars.getNombre(), jupiter.getNombre(), venus.getNombre()};
		int poder;

		 int opcion = JOptionPane.showOptionDialog(
		            null,
		           "¿Que Sailor Guerrera eliges para luchar contigo?",
		            "Batalla",
		            JOptionPane.DEFAULT_OPTION,
		            JOptionPane.PLAIN_MESSAGE,
		            null,
		            respuesta,
		            respuesta[0]
		        );
		 
		 if (opcion == 0) {
			String[] poderes = {mercury.getPoder1(), mercury.getPoder2()};
			poder = JOptionPane.showOptionDialog(
		            null,
		           "¿Que poder quieres usar?",
		            "Batalla",
		            JOptionPane.DEFAULT_OPTION,
		            JOptionPane.PLAIN_MESSAGE,
		            null,
		            poderes,
		            poderes[0]
		        );
			return mercury.usarPoder(poder);
		} else if (opcion == 1) {
			String[] poderes = {mars.getPoder1(), mars.getPoder2()};
			poder = JOptionPane.showOptionDialog(
		            null,
		           "¿Que poder quieres usar?",
		            "Batalla",
		            JOptionPane.DEFAULT_OPTION,
		            JOptionPane.PLAIN_MESSAGE,
		            null,
		            poderes,
		            poderes[0]
		        );
			return mars.usarPoder(poder);
		} else if (opcion == 2) {
			String[] poderes = {jupiter.getPoder1(), jupiter.getPoder2()};
			poder = JOptionPane.showOptionDialog(
		            null,
		           "¿Que poder quieres usar?",
		            "Batalla",
		            JOptionPane.DEFAULT_OPTION,
		            JOptionPane.PLAIN_MESSAGE,
		            null,
		            poderes,
		            poderes[0]
		        );
			return jupiter.usarPoder(poder);
		} else {
			String[] poderes = {venus.getPoder1(), venus.getPoder2()};
			poder = JOptionPane.showOptionDialog(
		            null,
		           "¿Que poder quieres usar?",
		            "Batalla",
		            JOptionPane.DEFAULT_OPTION,
		            JOptionPane.PLAIN_MESSAGE,
		            null,
		            poderes,
		            poderes[0]
		        );
			return venus.usarPoder(poder);
			} 
	}

	public boolean decidirBatalla(Jugador jugador, Personaje earth, Aliado moon, Aliado mercury, Aliado mars, Aliado jupiter, Aliado venus, Enemigo enemigo, String poder) {
		String poderTierra = "earthatk.jpg";
		if (enemigo.getPlaneta().equals("Sun") && poder.equals(mercury.getPoder1())) {
			JOptionPane.showMessageDialog(null, "", poder,  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("mercatk1.gif")));
			JOptionPane.showMessageDialog(null, "El ataque de agua de Sailor Mercury distrae a Sailor Sun.\n¡Es tu turno!", "Resultado",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
			JOptionPane.showMessageDialog(null, "", earth.getPoder1(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource(poderTierra)));
			mercury.modAfinidad(true);
        	jugador.calcularKarma(true, 1);
        	return true;
		} else if (enemigo.getPlaneta().equals("Sun") && poder.equals(mercury.getPoder2())) {
			JOptionPane.showMessageDialog(null, "", poder,  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("mercatk2.gif")));
			JOptionPane.showMessageDialog(null, "El ataque de agua de Sailor Mercury es evaporado por Sailor Sun.", "Resultado",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
			mercury.modAfinidad(false);
        	jugador.calcularKarma(false, 1);
        	return false;
		} else if (enemigo.getPlaneta().equals("Sun") && poder.equals(mars.getPoder1())) {
			JOptionPane.showMessageDialog(null, "", poder,  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("marsatk1.gif")));
			JOptionPane.showMessageDialog(null, "El ataque de Sailor Mars hace que Sailor Sun se contraiga.\n¡Es tu turno!", "Resultado",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
			JOptionPane.showMessageDialog(null, "", earth.getPoder1(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource(poderTierra)));
			mars.modAfinidad(true);
        	jugador.calcularKarma(true, 1);
        	return true;
		} else if (enemigo.getPlaneta().equals("Sun") && poder.equals(mars.getPoder2())) {
			JOptionPane.showMessageDialog(null, "", poder,  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("marsatk2.gif")));
			JOptionPane.showMessageDialog(null, "El ataque de fuego de Sailor Mars fortalece a Sailor Sun.", "Resultado",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
			mars.modAfinidad(false);
        	jugador.calcularKarma(false, 1);
        	return false;
		} else if (enemigo.getPlaneta().equals("Sun") && poder.equals(jupiter.getPoder1())) {
			JOptionPane.showMessageDialog(null, "", poder,  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("jupiteratk1.gif")));
			JOptionPane.showMessageDialog(null, "El ataque de Sailor Júpiter confunde a Sailor Sun.\n¡Es tu turno!", "Resultado",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
			JOptionPane.showMessageDialog(null, "", earth.getPoder1(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource(poderTierra)));
			jupiter.modAfinidad(true);
        	jugador.calcularKarma(true, 1);
        	return true;
		} else if (enemigo.getPlaneta().equals("Sun") && poder.equals(jupiter.getPoder2())) {
			JOptionPane.showMessageDialog(null, "", poder,  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("jupiteratk2.gif")));
			JOptionPane.showMessageDialog(null, "El ataque de Sailor Júpiter paraliza a Sailor Sun.\n¡Es tu turno!", "Resultado",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
			JOptionPane.showMessageDialog(null, "", earth.getPoder1(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource(poderTierra)));
			jupiter.modAfinidad(true);
        	jugador.calcularKarma(true, 1);
        	return true;
		} else if (enemigo.getPlaneta().equals("Sun") && poder.equals(venus.getPoder1())) {
			JOptionPane.showMessageDialog(null, "", poder,  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("venusatk1.gif")));
			JOptionPane.showMessageDialog(null, "El ligero ataque de Sailor Venus es absorbido por Sailor Sun.", "Resultado",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
			venus.modAfinidad(false);
        	jugador.calcularKarma(false, 1);
        	return false;
		} else if (enemigo.getPlaneta().equals("Sun") && poder.equals(venus.getPoder2())) {
			JOptionPane.showMessageDialog(null, "", poder,  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("venusatk2.gif")));
			JOptionPane.showMessageDialog(null, "El ataque de Sailor Venus restringe los movimientos de Sailor Sun.\n¡Es tu turno!", "Resultado",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
			JOptionPane.showMessageDialog(null, "", earth.getPoder1(),  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource(poderTierra)));
			venus.modAfinidad(true);
        	jugador.calcularKarma(true, 1);
        	return true;
		} else {
		return false;
		}
	}
	
	

}

//JOptionPane.showMessageDialog(null, "", "Narración",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
//JOptionPane.showMessageDialog(null, "", "Diálogo",  JOptionPane.PLAIN_MESSAGE, new ImageIcon(Historia.class.getResource("")));
