package app.car.spymanual;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import app.car.spymanual.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                NavHostFragment.findNavController(SecondFragment.this)
//                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
//            }
//        });

        WebView webView = (WebView) view.findViewById(R.id.webview);

        List<String> categories = new ArrayList<String>();
        categories.add("Anonimizacion");
        categories.add("Bing Hacking");
        categories.add("Borrar Identidad");
        categories.add("Buscadores");
        categories.add("Certificacion");
        categories.add("Clima/Horario");
        categories.add("Criptomonedas");
        categories.add("Dark Web");
        categories.add("DataLeaks");
        categories.add("Datos Bancarios");
        categories.add("Distribuciones OSINT");
        categories.add("DNI/CIF");
        categories.add("Documentos");
        categories.add("Emails");
        categories.add("Empresa/Profesional");
        categories.add("Facebook");
        categories.add("Geolocalizar");
        categories.add("Google Hacking");
        categories.add("Imagenes");
        categories.add("Instagram");
        categories.add("IPs");
        categories.add("Mapas");
        categories.add("Marcadores");
        categories.add("Monitores");
        categories.add("Nicknames");
        categories.add("Otras RRSS");
        categories.add("Personas");
        categories.add("Productividad");
        categories.add("Repositorios");
        categories.add("Software");
        categories.add("Telefonos");
        categories.add("Twitter");
        categories.add("Vehiculos");
        categories.add("Videos");
        categories.add("Webcams");
        categories.add("Webs");

        HashMap<String,ArrayList<String>> mapaOsint = new HashMap<>();

        ArrayList anonimizacion = new ArrayList();
        anonimizacion.add("Generador de conversaciones de WhatsAppyyyyhttp://www.fakewhats.com/generator");
        anonimizacion.add("Whonix – Sistema operativo navegación anónimayyyyhttps://www.whonix.org/");
        anonimizacion.add("Yopmail – Cuentas de Email temporalesyyyyhttp://www.yopmail.com/es/");
        anonimizacion.add("Emkei – Suplantar el email de otra personayyyyhttps://emkei.cz/");
        anonimizacion.add("Email Temporal gratisyyyyhttp://www.emailtemporalgratis.com/#/superrito.com/Preal1968/");
        anonimizacion.add("Simitator – Generador de perfiles y mensajes Fakeyyyyhttps://www.google.com");
        anonimizacion.add("Eff.org – Guías de privacidad y seguridadyyyyhttps://ssd.eff.org/es/module-categories/gu%C3%ADas-herramientas");
        anonimizacion.add("Navegador TORyyyyhttps://www.torproject.org/");
        anonimizacion.add("Gigatribe – Comparte archivos grandes encriptadosyyyyhttps://www.gigatribe.com/en/home");
        anonimizacion.add("Emails y SMS anónimosyyyyhttp://www.sharpmail.co.uk/");
        anonimizacion.add("Protomail – Email seguroyyyyhttps://protonmail.com/");
        anonimizacion.add("Generador de identidadesyyyyhttps://es.fakenamegenerator.com/");
        anonimizacion.add("Tutanota – Email anónimoyyyyhttps://tutanota.com/es/");
        anonimizacion.add("Anonymousemail – Email sin registroyyyyhttps://anonymousemail.me/");
        anonimizacion.add("Sadd – Escritorio virtual temporalyyyyhttps://sadd.io/");
        anonimizacion.add("Onionshare – Comparte archivos de forma anónimayyyyhttps://onionshare.org/");
        anonimizacion.add("Mohmal – Email temporal gratisyyyyhttps://www.mohmal.com/es");
        anonimizacion.add("Tails – Sistema operativo navegación anónimayyyyhttps://tails.boum.org/");
        anonimizacion.add("Servicios de Email Temporales y/o desechablesyyyyhttps://www.ghacks.net/2012/05/31/the-ultimate-disposable-email-provider-list-2012/");
        anonimizacion.add("Tunnelbear – VPN gratuitoyyyyhttps://www.tunnelbear.com/");
        anonimizacion.add("Tutoriales configurar privacidad RRSSyyyyhttps://www.youtube.com/watch?v=e4RWhzxPre4&list=PLUjcI9KR6XDCHpXn4mGg_jfg-qE5btEPW");
        anonimizacion.add("Cifrar emailsyyyyhttps://www.mailvelope.com/en");
        anonimizacion.add("Mailinator – Cuentas de Email temporalesyyyyhttps://www.mailinator.com/");
        anonimizacion.add("Tucktools – Creador de Tweet Falsosyyyyhttps://www.tucktools.com/spoof-tweet");
        anonimizacion.add("Receive-sms-online – Recibir SMS onlineyyyyhttps://www.receive-sms-online.info/");
        anonimizacion.add("Cambiar User-Agent del navegadoryyyyhttps://chrome.google.com/webstore/detail/user-agent-switcher-for-c/djflhoibgkdhkhhcedjiklpkjnoahfmg");
        anonimizacion.add("Privatix.com – VPN gratuitayyyyhttps://privatix.com/");
        anonimizacion.add("Borrar historial navegadoryyyyhttps://chrome.google.com/webstore/detail/clickclean/ghgabhipcejejjmhhchfonmamedcbeod?hl=es");
        anonimizacion.add("Boomeranggmail – Programar envio de emailyyyyhttps://www.boomeranggmail.com/es/");
        anonimizacion.add("ImageOptim – Elimina metadatos de imágenes (MAC)yyyyhttps://imageoptim.com/es.html");
        anonimizacion.add("Tunnelbear – VPN para el navegadoryyyyhttps://chrome.google.com/webstore/detail/tunnelbear-vpn/omdakjcmkglenbhjadbccaookpfjihpa");
        mapaOsint.put("Anonimizacion",anonimizacion);

        ArrayList bingHacking = new ArrayList();
        bingHacking.add("Sitios alojados en la misma IPyyyyhttps://www.bing.com/search?q=ip%3A222.212.130.224&qs=n&form=QBRE&sp=-1&pq=ip%3A222.212.130.224&sc=0-18&sk=&cvid=3BCFC7B03711470FBA2A069DF6CAFD43");
        bingHacking.add("Buscar por tipo de archivo en una webyyyyhttps://www.bing.com/search?q=site%3Arenfe.com+Filetype%3Adoc&qs=n&form=QBRE&sp=-1&pq=site%3Arenfe.com+filetype%3Adoc&sc=0-27&sk=&cvid=E878E72A222841C1BCDF03783202DFBA");
        bingHacking.add("Ficheros con una extensión concretayyyyhttps://www.bing.com/search?q=Contains%3Asql+intitle%22index+of%22&qs=n&form=QBRE&sp=-1&pq=contains%3Asql+intitle%22index+of%22&sc=0-30&sk=&cvid=C4D0EE370CED40CAB8FE4F800F9A2300");
        mapaOsint.put("Bing Hacking",bingHacking);

        ArrayList borrarIdentidad = new ArrayList();
        borrarIdentidad.add("Eliminar actividad en Googleyyyyhttps://myactivity.google.com/myactivity?pli=1");
        borrarIdentidad.add("Deseat.me – Borrar cuentas de Internetyyyyhttps://www.deseat.me/");
        borrarIdentidad.add("Justdeleteme – Eliminar todas las cuentas de Internetyyyyhttp://backgroundchecks.org/justdeleteme/");
        borrarIdentidad.add("OSI.es – Guía para borrar tu identidad digitalyyyyhttps://www.osi.es/es/actualidad/blog/2017/01/10/borrar-tu-identidad-online-no-es-imposible");
        borrarIdentidad.add("Accountkiller.com – Eliminar todas las cuentas de RRSSyyyyhttps://www.accountkiller.com/es/");
        borrarIdentidad.add("Mydatarequest – Descargar información personal de servicios onlineyyyyhttps://mydatarequest.com/");
        borrarIdentidad.add("Formulario solicitud «Derecho al olvido de Google»yyyyhttps://support.google.com/legal/contact/lr_eudpa?product=websearch&hl=es");
        mapaOsint.put("Borrar Identidad",borrarIdentidad);

        ArrayList buscadores = new ArrayList();
        buscadores.add("Duckduckgoyyyyhttps://duckduckgo.com/");
        buscadores.add("Googleyyyyhttps://www.google.es/");
        buscadores.add("Searchenginecolossus.com – Buscadores por paisesyyyyhttp://www.searchenginecolossus.com/");
        buscadores.add("Buscador personalizado de Google para OSINTyyyyhttps://cse.google.com/cse/publicurl?cx=012209864558240645678:orirysy9yqk");
        buscadores.add("Shodanyyyyhttps://www.shodan.io/");
        buscadores.add("Baiduyyyyhttps://www.baidu.com/");
        buscadores.add("Yandex (RU)yyyyhttps://www.yandex.ru/");
        buscadores.add("Qwantyyyyhttps://www.qwant.com/");
        buscadores.add("CSE – Buscar en varias RRSS a la vezyyyyhttps://cse.google.com/cse?cx=001580308195336108602:oyrkxatrfyq");
        buscadores.add("Google Correlateyyyyhttps://www.google.com/trends/correlate/");
        buscadores.add("Carrot2 -Buscador que agrupa los resultadosyyyyhttps://search.carrot2.org/");
        buscadores.add("Ixquickyyyyhttps://www.ixquick.com/");
        buscadores.add("Google Dataset Searchyyyyhttps://toolbox.google.com/datasetsearch");
        buscadores.add("Globograma – Listado de Buscadoresyyyyhttps://www.diigo.com/profile/globograma/search-engines");
        buscadores.add("Etools – Metabuscadoryyyyhttps://www.etools.ch/");
        buscadores.add("Pdffetch (Buscador de archivos PDF)yyyyhttp://pdffetch.com/");
        buscadores.add("Yahooyyyyhttps://es.yahoo.com/");
        buscadores.add("Fagan Finder – Busca en varios buscadoresyyyyhttps://www.faganfinder.com/");
        buscadores.add("Wolframalphayyyyhttps://www.wolframalpha.com/");
        buscadores.add("Yandex – Buscador Rusoyyyyhttps://www.yandex.com/");
        buscadores.add("Lycosyyyyhttp://search.lycos.com/?OrigLycosTld=es");
        buscadores.add("Ecosiayyyyhttps://www.ecosia.org/");
        buscadores.add("Bingyyyyhttps://www.bing.com/?setlang=es");
        buscadores.add("Buscador Forocochesyyyyhttps://www.forocoches.com/");
        buscadores.add("Instya.com – Busca webs alternativasyyyyhttp://www.instya.com/");
        buscadores.add("Zapmeta – Buscar en varios buscadoresyyyyhttps://www.zapmeta.com/");
        buscadores.add("Exaleadyyyyhttps://www.exalead.com/search/");
        buscadores.add("Buscador que agrupa los resultadosyyyyhttp://yippy.com/");
        buscadores.add("Gibiruyyyyhttp://gibiru.com/");
        buscadores.add("Uvrx – Busca en RRSSyyyyhttp://www.uvrx.com/");
        buscadores.add("Millionshort – Filtra por resultados profundosyyyyhttps://millionshort.com/");
        buscadores.add("Yippy – Resultados por categoríasyyyyhttps://yippy.com/");
        buscadores.add("Searx – Metabuscadoryyyyhttps://searx.me/");
        mapaOsint.put("Buscadores",buscadores);

        ArrayList certificacion = new ArrayList();
        certificacion.add("eGarante – Capturas certificadasyyyyhttps://www.egarante.com/versiones-gratuitas-de-uso-personal-de-certificacion-de-correos-y-web/");
        certificacion.add("SaveTheProof | Certifica páginas web y ficherosyyyyhttps://www.savetheproof.com/");
        certificacion.add("FireShot – Capturador de pantalla completayyyyhttps://chrome.google.com/webstore/detail/take-webpage-screenshots/mcbpblocgmgfnpjjppndjkmgjaogfceg?hl=es-419");
        certificacion.add("Sellado de tiempoyyyyhttps://www.freetsa.org/index_es.php");
        certificacion.add("Webrecorder – Grabador de navegación webyyyyhttps://webrecorder.io/");
        certificacion.add("Pdfmyurl.com – Generar un PDF desde una URLyyyyhttp://pdfmyurl.com/");
        certificacion.add("Onlinemd5 – Generar HASHyyyyhttp://onlinemd5.com/");
        certificacion.add("Web2pdfconvert.com – Generar un PDF desde una URLyyyyhttps://www.web2pdfconvert.com/");
        certificacion.add("SingleFile – Ext. Capturas Webyyyyhttps://github.com/gildas-lormeau/SingleFile");
        certificacion.add("Page2images – Generador online de capturas webyyyyhttp://www.page2images.com/");
        mapaOsint.put("Certificacion",certificacion);

        ArrayList climaHorario = new ArrayList();
        climaHorario.add("Información meteorológicayyyyhttps://www.wunderground.com/weather/es/madrid/40.419%2C-3.692");
        climaHorario.add("Consultar cualquier cosayyyyhttps://www.wolframalpha.com/");
        climaHorario.add("Ventusky – Clima en tiempo realyyyyhttps://www.ventusky.com/");
        climaHorario.add("Herramientas horariasyyyyhttps://www.timeanddate.de/");
        climaHorario.add("Calcular la hora por la posición del Solyyyyhttps://www.suncalc.org/");
        climaHorario.add("Qué tiempo hizo un díayyyyhttps://www.accuweather.com/es/es/madrid/308526/february-weather/308526");
        climaHorario.add("Hora – Hora mundialyyyyhttp://www.hora.es/");
        climaHorario.add("Windy – Clima en tiempo realyyyyhttps://www.windy.com/");
        climaHorario.add("Timeanddate.com – Conversor zona horariayyyyhttps://www.timeanddate.com/worldclock/converter-classic.html");
        climaHorario.add("Shadowcalculator – Calcular la posición del solyyyyhttp://shadowcalculator.eu/#/lat/40.41793317369381/lng/-3.681524442134574");
        mapaOsint.put("Clima/Horario",climaHorario);

        ArrayList criptomonedas = new ArrayList();
        criptomonedas.add("Blockexplorer – información sobre transaccionesyyyyhttps://blockexplorer.com/");
        criptomonedas.add("Aware-online – Herramientas búsqueda criptomonedasyyyyhttps://www.aware-online.com/osint-tools/cryptocurrency-search-tool/");
        mapaOsint.put("Criptomonedas",criptomonedas);

        ArrayList darkWeb = new ArrayList();
        darkWeb.add("The Hidden Wiki (No necesita TOR)yyyyhttps://zqktlwi4fecvo6ri.onion.to/wiki/index.php/Main_Page");
        darkWeb.add("The Hidden Wiki (Necesita TOR)yyyyhttps://zqktlwi4fecvo6ri.onion/wiki/index.php/Main_Page");
        darkWeb.add("Tor3web – Buscador red TORyyyyhttps://hss3uro2hsxfogfq.onion.to/");
        darkWeb.add("IACA – Herramientas de búsquedayyyyhttps://iaca-darkweb-tools.com/");
        darkWeb.add("Navegador TORyyyyhttps://www.torproject.org/");
        darkWeb.add("Ahmia.fi – Buscador red TORyyyyhttps://ahmia.fi/");
        darkWeb.add("Torchtorsearch.com – Buscador red TORyyyyhttp://www.torchtorsearch.com/");
        mapaOsint.put("Dark Web",darkWeb);

        ArrayList dataLeaks = new ArrayList();
        dataLeaks.add("Haveibeenpwned.com – Buscador de datos comprometidosyyyyhttps://haveibeenpwned.com/");
        dataLeaks.add("Ashley.cynic.al – Buscador de datos comprometidosyyyyhttps://ashley.cynic.al/");
        dataLeaks.add("Leakedsource – Buscador datos comprometidosyyyyhttps://leakedsource.ru/");
        dataLeaks.add("Ghostproject – Buscador de datos comprometidosyyyyhttps://ghostproject.fr/");
        dataLeaks.add("Dehashed – Buscador de datos comprometidosyyyyhttps://dehashed.com/");
        dataLeaks.add("Firefox Monitor – Buscador de datos comprometidosyyyyhttps://monitor.firefox.com/");
        dataLeaks.add("Weleakinfo – Buscador datos comprometidosyyyyhttps://weleakinfo.com/");
        dataLeaks.add("SpyCloud – Buscador de datos comprometidosyyyyhttps://spycloud.com/");
        dataLeaks.add("Avast – Buscador de datos comprometidosyyyyhttps://www.avast.com/hackcheck/results");
        dataLeaks.add("Iintelx.io – Buscador datos comprometidosyyyyhttps://intelx.io/");
        dataLeaks.add("Psbdmp – Buscador datos comprometidosyyyyhttps://psbdmp.ws/");
        mapaOsint.put("DataLeaks",dataLeaks);

        ArrayList datosBancarios = new ArrayList();
        datosBancarios.add("Buscar por los dígitos de tarjeta bancariayyyyhttps://www.bindb.com/bin-database.html");
        datosBancarios.add("Buscar por nº IBANyyyyhttps://es.iban.com/");
        datosBancarios.add("Rangos identificación de tarjetas de créditoyyyyhttps://en.m.wikipedia.org/wiki/Payment_card_number");
        mapaOsint.put("Datos Bancarios",datosBancarios);

        ArrayList distribucionesOsint = new ArrayList();
        distribucionesOsint.add("Huronyyyyhttps://github.com/HuronOsint/OsintDistro");
        distribucionesOsint.add("Buscadoryyyyhttps://inteltechniques.com/buscador/");
        distribucionesOsint.add("Osintuxyyyyhttp://www.osintux.org/");
        mapaOsint.put("Distribuciones OSINT",distribucionesOsint);

        ArrayList dniCif = new ArrayList();
        dniCif.add("Boletines oficiales municipalesyyyyhttps://www.google.es/search?ei=912OW7y6EOePlwTx7IP4Ag&q=Bolet%C3%ADn+Oficial+del+Ayuntamiento+de+NOMBRE+AYUNTAMIENTO&oq=Bolet%C3%ADn+Oficial+del+Ayuntamiento+de+NOMBRE+AYUNTAMIENTO&gs_l=psy-ab.12...4831.16432.0.20009.0.0.0.0.0.0.0.0..0.0....0...1c.1.64.psy-ab..0.0.0....0.3jIqWuLPFK0");
        dniCif.add("TESTRA – buscador de sanciones de tráficoyyyyhttps://sedeapl.dgt.gob.es/WEB_TTRA_CONSULTA/Todos.faces?idioma=es");
        dniCif.add("Boletines oficiales autonómicosyyyyhttps://www.boe.es/legislacion/otros_diarios_oficiales.php#boletines_autonomicos");
        dniCif.add("BORME – Anuncios de registro mercantilyyyyhttps://www.boe.es/anuncios/anborme.php");
        dniCif.add("Boletines oficiales provincialesyyyyhttps://www.boe.es/legislacion/otros_diarios_oficiales.php#boletines_provinciales");
        dniCif.add("BOE – Buscar en todo el boletínyyyyhttps://www.boe.es/buscar/boe.php");
        mapaOsint.put("DNI/CIF",dniCif);

        ArrayList documentos = new ArrayList();
        documentos.add("OCR onlineyyyyhttp://www.free-ocr.com/");
        documentos.add("Buscar en Google Driveyyyyhttps://www.google.es/?q=site:drive.google.com+%22keyword%22&gws_rd=cr&dcr=0&ei=ukN_WtORKcHBUofgvpgF");
        documentos.add("Elevenpaths – Metadatos de documentosyyyyhttps://metashieldclean-up.elevenpaths.com/#");
        documentos.add("Buscar en Amazon AWSyyyyhttps://www.google.es/search?q=site:s3.amazonaws.com+%22keyword%22&gws_rd=cr&dcr=0&ei=0kN_Wu-EIobnUr2AqYgC");
        documentos.add("Buscar en Onedriveyyyyhttps://www.google.es/search?num=100&safe=off&dcr=0&ei=vXO7WqbVAoKlUanFsLgH&q=site%3Aonedrive.live.com+%22keyword%22&oq=site%3Aonedrive.live.com+%22keyword%22&gs_l=psy-ab.12...15186.17207.0.19077.7.7.0.0.0.0.135.507.6j1.7.0....0...1.1.64.psy-ab..0.0.0....0.yLaCnMsc4bU");
        documentos.add("Buscar en Scribdyyyyhttps://es.scribd.com/");
        documentos.add("Buscar en Google Calendaryyyyhttps://www.google.es/search?dcr=0&ei=U3S7WqGuMIieU-aHlfgE&q=site%3Acalendar.google.com%2Fcalendar%2Fembed+TEST&oq=site%3Acalendar.google.com%2Fcalendar%2Fembed+TEST&gs_l=psy-ab.12...0.0.0.16157.0.0.0.0.0.0.0.0..0.0....0...1..64.psy-ab..0.0.0....0.18zhupm42lo");
        documentos.add("Google Académicoyyyyhttps://scholar.google.es/");
        documentos.add("Alertas de Pastebinesyyyyhttps://andrewmohawk.com/pasteLert/");
        documentos.add("Buscar en Google Docsyyyyhttps://www.google.es/?q=site:docs.google.com+%22keyword%22&gws_rd=cr&dcr=0&ei=qEN_WpP4LYzXU8PYstAL");
        documentos.add("Globalfilesearch – Busca en FTPs públicosyyyyhttps://www.google.es/?q=site:docs.google.com+%22keyword%22&gws_rd=cr&dcr=0&ei=qEN_WpP4LYzXU8PYstAL");
        mapaOsint.put("Documentos",documentos);

        ArrayList emails = new ArrayList();
        emails.add("yyyy");
        mapaOsint.put("Emails",emails);

        ArrayList empresaProfesional = new ArrayList();
        empresaProfesional.add("yyyy");
        mapaOsint.put("Empresa/Profesional",empresaProfesional);

        ArrayList facebook = new ArrayList();
        facebook.add("Descargar vídeos de Facebookyyyyhttps://www.fbdown.net/");
        facebook.add("Intelx – Búsqueda e Facebookyyyyhttps://intelx.io/tools?tab=facebook");
        facebook.add("FB-Search – Búsqueda en Facebookyyyyhttps://sowdust.github.io/fb-search/");
        facebook.add("Exportador de comentarios a CSVyyyyhttps://exportcomments.com/");
        facebook.add("Whopostedwhat – Busca por fechasyyyyhttps://www.whopostedwhat.com/");
        facebook.add("URLs personalizadas para buscar en Facebookyyyyhttps://gist.github.com/nemec/2ba8afa589032f20e2d6509512381114");
        facebook.add("Socialfy – Exportar comentarios a CSVyyyyhttps://socialfy.pw/");
        facebook.add("Obtener ID perfil de Facebookyyyyhttps://es.piliapp.com/facebook/id/");
        mapaOsint.put("Facebook",facebook);

        ArrayList geolocalizar = new ArrayList();
        geolocalizar.add("yyyy");
        geolocalizar.add("yyyy");
        geolocalizar.add("yyyy");
        geolocalizar.add("yyyy");
        geolocalizar.add("yyyy");
        geolocalizar.add("yyyy");
        geolocalizar.add("yyyy");
        geolocalizar.add("yyyy");
        geolocalizar.add("yyyy");
        geolocalizar.add("yyyy");
        geolocalizar.add("yyyy");
        geolocalizar.add("yyyy");
        geolocalizar.add("yyyy");
        geolocalizar.add("yyyy");
        mapaOsint.put("Geolocalizar",geolocalizar);

        ArrayList googleHacking = new ArrayList();
        googleHacking.add("yyyy");
        mapaOsint.put("Google Hacking",googleHacking);

        ArrayList imagenes = new ArrayList();
        imagenes.add("yyyy");
        mapaOsint.put("Imagenes",imagenes);

        ArrayList instagram = new ArrayList();
        instagram.add("yyyy");
        instagram.add("yyyy");
        instagram.add("yyyy");
        instagram.add("yyyy");
        instagram.add("yyyy");
        instagram.add("yyyy");
        instagram.add("yyyy");
        instagram.add("yyyy");
        instagram.add("yyyy");
        instagram.add("yyyy");
        instagram.add("yyyy");
        instagram.add("yyyy");
        instagram.add("yyyy");
        instagram.add("yyyy");
        instagram.add("yyyy");
        instagram.add("yyyy");
        instagram.add("yyyy");
        instagram.add("yyyy");
        instagram.add("yyyy");
        mapaOsint.put("Instagram",instagram);

        ArrayList ips = new ArrayList();
        ips.add("yyyy");
        ips.add("yyyy");
        ips.add("yyyy");
        ips.add("yyyy");
        ips.add("yyyy");
        ips.add("yyyy");
        ips.add("yyyy");
        ips.add("yyyy");
        ips.add("yyyy");
        ips.add("yyyy");
        mapaOsint.put("IPs",ips);

        ArrayList mapas = new ArrayList();
        mapas.add("yyyy");
        mapas.add("yyyy");
        mapas.add("yyyy");
        mapas.add("yyyy");
        mapas.add("yyyy");
        mapas.add("yyyy");
        mapas.add("yyyy");
        mapas.add("yyyy");
        mapas.add("yyyy");
        mapas.add("yyyy");
        mapas.add("yyyy");
        mapas.add("yyyy");
        mapaOsint.put("Mapas",mapas);

        ArrayList monitores = new ArrayList();
        monitores.add("yyyy");
        monitores.add("yyyy");
        monitores.add("yyyy");
        monitores.add("yyyy");
        monitores.add("yyyy");
        monitores.add("yyyy");
        monitores.add("yyyy");
        monitores.add("yyyy");
        monitores.add("yyyy");
        monitores.add("yyyy");
        monitores.add("yyyy");
        monitores.add("yyyy");
        monitores.add("yyyy");
        monitores.add("yyyy");
        mapaOsint.put("Monitores",monitores);

        ArrayList nicknames = new ArrayList();
        nicknames.add("yyyy");
        nicknames.add("yyyy");
        nicknames.add("yyyy");
        nicknames.add("yyyy");
        nicknames.add("yyyy");
        nicknames.add("yyyy");
        nicknames.add("yyyy");
        nicknames.add("yyyy");
        nicknames.add("yyyy");
        nicknames.add("yyyy");
        nicknames.add("yyyy");
        mapaOsint.put("Nicknames",nicknames);

        ArrayList otrasRrss = new ArrayList();
        otrasRrss.add("yyyy");
        otrasRrss.add("yyyy");
        otrasRrss.add("yyyy");
        otrasRrss.add("yyyy");
        otrasRrss.add("yyyy");
        otrasRrss.add("yyyy");
        otrasRrss.add("yyyy");
        otrasRrss.add("yyyy");
        otrasRrss.add("yyyy");
        otrasRrss.add("yyyy");
        otrasRrss.add("yyyy");
        otrasRrss.add("yyyy");
        otrasRrss.add("yyyy");
        otrasRrss.add("yyyy");
        otrasRrss.add("yyyy");
        mapaOsint.put("Otras RRSS",otrasRrss);

        ArrayList personas = new ArrayList();
        personas.add("yyyy");
        personas.add("yyyy");
        personas.add("yyyy");
        personas.add("yyyy");
        personas.add("yyyy");
        personas.add("yyyy");
        personas.add("yyyy");
        personas.add("yyyy");
        personas.add("yyyy");
        personas.add("yyyy");
        personas.add("yyyy");
        personas.add("yyyy");
        personas.add("yyyy");
        personas.add("yyyy");
        personas.add("yyyy");
        personas.add("yyyy");
        personas.add("yyyy");
        personas.add("yyyy");
        personas.add("yyyy");
        mapaOsint.put("Personas",personas);

        ArrayList productividad = new ArrayList();
        productividad.add("yyyy");
        productividad.add("yyyy");
        productividad.add("yyyy");
        productividad.add("yyyy");
        productividad.add("yyyy");
        productividad.add("yyyy");
        productividad.add("yyyy");
        productividad.add("yyyy");
        productividad.add("yyyy");
        productividad.add("yyyy");
        productividad.add("yyyy");
        productividad.add("yyyy");
        productividad.add("yyyy");
        mapaOsint.put("Productividad",productividad);

        ArrayList repositorios = new ArrayList();
        repositorios.add("yyyy");
        mapaOsint.put("Repositorios",repositorios);

        ArrayList software = new ArrayList();
        software.add("yyyy");
        software.add("yyyy");
        software.add("yyyy");
        software.add("yyyy");
        software.add("yyyy");
        software.add("yyyy");
        software.add("yyyy");
        software.add("yyyy");
        software.add("yyyy");
        software.add("yyyy");
        mapaOsint.put("Software",software);

        ArrayList telefonos = new ArrayList();
        telefonos.add("yyyy");
        telefonos.add("yyyy");
        telefonos.add("yyyy");
        telefonos.add("yyyy");
        telefonos.add("yyyy");
        telefonos.add("yyyy");
        telefonos.add("yyyy");
        telefonos.add("yyyy");
        telefonos.add("yyyy");
        telefonos.add("yyyy");
        telefonos.add("yyyy");
        telefonos.add("yyyy");
        mapaOsint.put("Telefonos",telefonos);

        ArrayList twitter = new ArrayList();
        twitter.add("yyyy");
        mapaOsint.put("Twitter",twitter);

        ArrayList vehiculos = new ArrayList();
        vehiculos.add("yyyy");
        vehiculos.add("yyyy");
        vehiculos.add("yyyy");
        vehiculos.add("yyyy");
        vehiculos.add("yyyy");
        vehiculos.add("yyyy");
        vehiculos.add("yyyy");
        vehiculos.add("yyyy");
        vehiculos.add("yyyy");
        vehiculos.add("yyyy");
        vehiculos.add("yyyy");
        vehiculos.add("yyyy");
        vehiculos.add("yyyy");
        vehiculos.add("yyyy");
        mapaOsint.put("Vehiculos",vehiculos);

        ArrayList videos = new ArrayList();
        videos.add("yyyy");
        mapaOsint.put("Videos",videos);

        ArrayList webcams = new ArrayList();
        webcams.add("Webcams de tráfico en directoyyyyhttps://www.google.es/search?q=camaras+trafico+ayto&oq=camaras+trafico+ayto&aqs=chrome..69i57j0l5.7640j0j4&sourceid=chrome&ie=UTF-8");
        webcams.add("Eltiempodeunvistazo – Tiempo y tráfico en directoyyyyhttp://www.eltiempodeunvistazo.com/");
        webcams.add("DGT – Cámaras de tráficoyyyyhttp://www.dgt.es/es/el-trafico/camaras-de-trafico/");
        mapaOsint.put("Webcams",webcams);

        ArrayList webs = new ArrayList();
        webs.add("yyyy");
        mapaOsint.put("Webs",webs);

        // Find the ScrollView
        ScrollView scrollView = (ScrollView) view.findViewById(R.id.scrollviewosint);

// Create a LinearLayout element
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(LinearLayout.VERTICAL);

// Add Buttons
        for (String data:categories){

            Button button = new Button(getContext());
            button.setText(data);
            button.setTag(data);
            linearLayout.addView(button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    linearLayout.removeAllViews();
                    for (String data:mapaOsint.get(button.getTag())){
                        Button button = new Button(view.getContext());
                        button.setText(data.split("yyyy")[0]);
                        button.setTag(data);
                        linearLayout.addView(button);
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                webView.setVisibility(View.VISIBLE);
                                webView.setWebViewClient(new WebViewClient());
                                webView.loadUrl(data.split("yyyy")[1]);
                            }
                        });
                    }

                }
            });
        }

        scrollView.addView(linearLayout);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}