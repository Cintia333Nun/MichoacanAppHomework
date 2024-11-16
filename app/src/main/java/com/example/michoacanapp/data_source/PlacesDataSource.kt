package com.example.michoacanapp.data_source

import com.example.michoacanapp.R
import com.example.michoacanapp.models.Place

fun getDataPlaces(): List<Place> {
    return listOf(
        Place(
            name = "Patzcuaro",
            photos = listOf(
                R.drawable.patzcuaro_1,
                R.drawable.patzcuaro_2,
                R.drawable.patzcuaro_3,
                R.drawable.patzcuaro_4,
                R.drawable.patzcuaro_5
            ),
            hotels = listOf(
                Place.Item("Best Western Plus Posada de Don Vasco", "A 1.92 km del centro", 8.4f),
                Place.Item("Hotel La Parroquia", "A 243 m del centro", 7.6f),
                Place.Item("Hotel Campanario de San Juan-Spa", "A 546 m del centro", 6.9f),
                Place.Item("Zirahuen Forest And Resort", "A 14.53 km del centro", 7.3f),
                Place.Item("Hotel Posada de la Salud", "A 330 m del centro", 8.4f),
                Place.Item("Villa Patzcuaro Garden Hotel & RV Park", "A 2.18 km del centro", 8.2f),
                Place.Item("OYO Posada De Los Angeles, Pátzcuaro", "A 324 m del centro", 7.6f),
                Place.Item("Hotel Mansion de los Sueños", "A 178 m del centro", 8.8f),
                Place.Item("Hotel Porton Del Cielo", "A 1.55 km del centro", 8.0f),
                Place.Item("Hotel Refugio del Angel", "A 208 m del centro", 8.4f),
                Place.Item("OYO Los Alcatraces", "A 3.84 km del centro", 0f),
                Place.Item("Casa Martina Guest House", "A 638 m del centro", 0f),
                Place.Item("Hotel Pueblo Grande", "A 232 m del centro", 0f),
                Place.Item("Posada Yolihuani", "A 445 m del centro", 9.4f),
                Place.Item("Brisas de Sol", "A 1.24 km del centro", 9.4f)
            ),
            restaurants = listOf(
                Place.Item("Casa Del Naranjo Restaurante", "Mexicana, Parrillada $$ - $$$", 4.5f),
                Place.Item("Restaurante Doña Paca", "Mexicana, Internacional $$ - $$$", 4.6f),
                Place.Item("Restaurante Ibarra 14", "Italiana, Mexicana $$$$", 5f),
                Place.Item("El Patio Restaurant", "Mexicana, Latina $$ - $$$", 4f),
                Place.Item("Al Forno Pizzeria - Ristorante Italiano", "Italiana, Pizzería $$ - $$$", 5f),
                Place.Item("Casa Musi", "Mexicana, Bar $$ - $$$", 4.5f),
                Place.Item("Santo Huacal", "Mexicana, Internacional $$ - $$$", 5f)
            ),
            moreData = """
Pátzcuaro conjunta la vida moderna con las tradiciones purépechas.
Un paseo por su centro te llevará al pasado a través de calles empedradas y empinadas, llenas de gente y artesanías.

Las iglesias de estilo barroco y neoclásico le dan el toque distintivo a las amplias plazas, y a las casas de adobe y teja.
Este pueblo mágico puede presumir más de 500 años de historia.

Fundado por Don Vasco de Quiroga para ser el centro político y religioso de la región.
Él erigió la Basílica de Nuestra Señora de la Salud y fundó la primera universidad de México,
el Colegio de San Nicolás, hoy Museo de Artes e Industrias Populares.

Recorrer este lugar es deleite para conocedores, exploradores y fotógrafos.

Por las mañanas, acude a la plaza Gertrudis Bocanegra, un excelente lugar para degustar productos típicamente michoacanos
como los charales secos, las corundas rellenas o el queso Cotija.

Por las tardes acude a restaurantes, cafés, neverías y mezcalerías de moda que congregan a locales y foráneos
bajo los portales de la plaza Vasco de Quiroga amenizadas con la música tradicional de los viejitos.

Características:
- Se incorporó al programa Pueblos Mágicos en el año 2002.
- En Pátzcuaro los purépechas establecieron un importante centro ceremonial, mismo que fundó Curátame en 1324
  y que fue gobernado por Tariácuri a partir de 1372.
- Su nombre significa "la puerta del cielo" y fue el principal centro religioso de esta civilización
  puesto que se creía que aquí ascendían y descendían los dioses.
- Pátzcuaro fue una de las primeras ciudades fundadas por los purépechas, también conocidos como tarascos, hacia el año 1300.

Atractivos:
- Antiguo Colegio de San Nicolás
- Casa de los Once Patios
- Plaza Vasco de Quiroga
- Templo del Sagrario
- Basílica de la Virgen de la Salud
- Templo y Hospital de San Juan de Dios
- La Plaza de San Francisco
- Palacio de Huitziméngari
- Biblioteca Pública Gertrudis Bocanegra
- Teatro Emperador Caltzontzin

Festividades:
- Aniversario de Don Vasco de Quiroga, 14 de marzo. Semana cultural.
- Aniversario de la Ciudad, 28 de septiembre.
- "Kuirsi-atakua", 31 de octubre. Cacería ceremonial de patos (Janitzio).
- Día de Muertos, 1 al 2 de noviembre.
- Día de la Virgen de la Salud, 7 al 8 de diciembre.

Ubicación:
Se localiza al centro del Estado, limita al norte con Tzintzuntzan, al este con Huiramba, al sur con Salvador Escalante, y al oeste con Tingambato y Erongarícuaro.
Puedes ir por avión a Morelia, a solo 59 km.. Ya en la capital michoacana, por la autopista Morelia-Pátzcuaro a menos de una hora.
""".trimIndent()
        ),
        Place(
            name = "Barranca de cupatitzio",
            photos = listOf(
                R.drawable.barranca_1,
                R.drawable.barranca_2,
                R.drawable.barranca_3,
                R.drawable.barranca_4,
                R.drawable.barranca_5
            ),
            hotels = listOf(
                Place.Item("Holiday Inn Uruapan, an IHG Hotel", "Uruapan", 9.0f),
                Place.Item("Hotel Concordia", "Uruapan Centro", 8.0f),
                Place.Item("Hotel Pie de la Sierra", "Uruapan", 8.4f),
                Place.Item("Hotel Mi Solar", "Uruapan Centro", 9.2f),
                Place.Item("Hotel Regis", "Uruapan Centro", 8.0f),
                Place.Item("Hotel Plaza Uruapan", "Uruapan Centro", 9.2f),
                Place.Item("Hotel Mi Solar Ejecutivo", "Uruapan Centro", 9.2f),
                Place.Item("Mansión del Cupatitzio", "Uruapan", 9.2f),
                Place.Item("Hotel Monarca", "Uruapan Centro", 7.2f)
            ),
            restaurants = listOf(
                Place.Item("Restaurante De Mi Tierra", "A 0.2 km de Parque Nacional Barranca del Cupatitzio", 4f),
                Place.Item("Pulquería Dos Conejos", "A 0.1 km de Parque Nacional Barranca del Cupatitzio", 1f),
                Place.Item("La Troje De Ala", "A 0.3 km de Parque Nacional Barranca del Cupatitzio", 1f),
                Place.Item("Cocina Economica Mary", "A 0.4 km de Parque Nacional Barranca del Cupatitzio", 3.5f),
                Place.Item("Antojitos Yucatecos Cox Hanal", "A 0.5 km de Parque Nacional Barranca del Cupatitzio", 4f),
                Place.Item("Salt", "A 0.5 km de Parque Nacional Barranca del Cupatitzio", 3.5f),
                Place.Item("La Mansion del Cupatitzio", "A 0.6 km de Parque Nacional Barranca del Cupatitzio", 4.2f),
                Place.Item("Gastrocervecero del Cupatitzio", "A 0.6 km de Parque Nacional Barranca del Cupatitzio", 3f),
                Place.Item("Gratissima La Casa Del Aguacate", "A 0.6 km de Parque Nacional Barranca del Cupatitzio", 4f),
                Place.Item("Ostioneria La Marinera Centro", "A 0.6 km de Parque Nacional Barranca del Cupatitzio", 4f),
                Place.Item("Cafe La Lucha", "A 0.9 km de Parque Nacional Barranca del Cupatitzio", 3.9f),
                Place.Item("Restaurante Las Camelinas", "A 0.8 km de Parque Nacional Barranca del Cupatitzio", 4.2f),
                Place.Item("Cenaduria Lupita Uruapan", "A 0.1 km de Parque Nacional Barranca del Cupatitzio", 4f),
                Place.Item("Taqueria Carlitos", "A 0.7 km de Parque Nacional Barranca del Cupatitzio", 4f),
                Place.Item("Café Tradicional de Uruapan", "A 0.8 km de Parque Nacional Barranca del Cupatitzio", 4f),
                Place.Item("UNO Cocina de Barrio", "A 0.9 km de Parque Nacional Barranca del Cupatitzio", 4f),
                Place.Item("El Rincon de Aguililla", "A 2.4 km de Parque Nacional Barranca del Cupatitzio", 4.5f)
            ),
            moreData = """
Forma parte de un importante corredor biológico situado entre el Pico de Tancítaro y la zona forestal de Uruapan, Michoacán.

En el parque se han registrado 495 especies de plantas nativas y 213 especies de vertebrados terrestres.

Es uno de los principales centros recreativos del estado de Michoacán. En este espacio se generan importantes servicios ambientales, entre ellos, 
protección de la diversidad biológica, captación de agua de lluvia, regulación del clima, captura de carbono y producción de oxígeno.

La captación de lluvia es una de las funciones más importantes del parque, pues allí se recargan los mantos acuíferos que dan origen al 
río Cupatitzio, el cual abastece de agua potable a la ciudad de Uruapan y genera energía eléctrica para regar campos de cultivo. 

Este río nace dentro de los terrenos del parque, en un manantial conocido como “la rodilla del diablo”. Recorre 19 hectáreas a través de una ribera llena de exuberante vegetación.

El parque, una de las áreas nacionales protegidas más pequeñas de México, abarca 450 hectáreas de extensión y está ubicado en el municipio de Uruapan, Michoacán. 
Fue decretado como parque nacional el 2 de noviembre de 1938 y en el 2007 fue publicado su programa de manejo, instrumento mediante el cual 
es regulada su administración y operación.

Riqueza animal y vegetal:

En el parque se han registrado 495 especies de plantas nativas y 213 especies de vertebrados terrestres. 
De ellas, 31 especies de plantas y animales están consideradas en riesgo por la NOM-059-SEMARNAT-2010.

Del total de especies, 28 son endémicas: dos de anfibios, tres de reptiles, 14 de aves, cinco de mamíferos y cuatro de orquídeas. 
Están registradas 84 especies de hongos.

Es centro de refugio para especies de aves migratorias neotropicales. 
Están representados dos tipos de vegetación del bosque templado: pino y pino-encino, además de bosque mesófilo de montaña.
            """.trimIndent()
        ),
        Place(
            name = "Mariposa  monarca",
            photos = listOf(
                R.drawable.mariposa_1,
                R.drawable.mariposa_2,
                R.drawable.mariposa_3,
                R.drawable.mariposa_4,
                R.drawable.mariposa_5
            ),
            hotels = listOf(
                Place.Item(title = "Suites Plaza del Rio - Family Hotel Malecon Centro", text = "Downtown Puerto Vallarta", rate = 2.5f),
                Place.Item(title = "Beachscape Kin ha Villas & Suites", text = "Zona Hotelera", rate = 3.5f),
                Place.Item(title = "Breathless Riviera Cancun Resort & Spa - Adults Only - All Inclusive", text = "", rate = 4.5f),
                Place.Item(title = "Roundtrip non-stop flight included", text = "Guadalajara (GDL) to Cancun (CUN)\n8.2/10 Very Good! (1,001 reviews)", rate = 8.2f)
            ),
            restaurants = listOf(
                Place.Item(title = "Restaurante 1900", text = "Calle Moneda s/n Plaza de la Constitución, Tlalpan\nArgentina Bar de vinos De Europa", rate = 4.5f),
                Place.Item(title = "Central Europea Italiana Parrilla Pizzería", text = "A 5.7 km de Santuario de la Mariposa Monarca Sierra Chincua\nMexicana, Latina, Española", rate = 3.5f),
                Place.Item(title = "Pinche Chilango", text = "Miguel Hidalgo 18 Ocampo Michoacan\nA 11.5 km de Santuario de la Mariposa Monarca Sierra Chincua\nEstadounidense, Cervecería, Bar, Parrillada, Parrilla, Pub", rate = 3.5f),
                Place.Item(title = "La Rockola", text = "A 5.6 km de Santuario de la Mariposa Monarca Sierra Chincua", rate = 3.5f),
                Place.Item(title = "Ciber Gloria", text = "A 16 km de Santuario de la Mariposa Monarca Sierra Chincua", rate = 3.5f)
            ),
            moreData = """
Esta especie emblemática ofrece un extraordinario espectáculo de la naturaleza. Se recomienda permanecer en silencio durante la estancia en el Santuario, no usar flash para tomar fotografías y no molestar, sujetar o capturar mariposas.

Conocer a las mariposas Monarca en su hábitat es una experiencia extraordinaria que por fortuna podemos vivir en México. Múltiples factores ecológicos, económicos y sociales intervienen en su singular proceso migratorio y de reproducción que involucra a tres naciones.

Millones de estos insectos lepidópteros realizan un asombroso viaje de tres meses a lo largo de 2,000 y hasta 4,500 km. desde Canadá y Estados Unidos. Ingresan a México y atraviesan 9 entidades: Coahuila, Nuevo León, Tamaulipas, Zacatecas, Querétaro, Aguascalientes, Guanajuato, San Luis Potosí e Hidalgo.

Aquí te decimos cómo puedes visitar a las Monarca y disfrutar este espectáculo que la naturaleza nos ofrece.

El Rosario, en el municipio de Ocampo, en Michoacán:

Se ubica dentro de la Reserva de la Biósfera de la Mariposa Monarca, a escasos kilómetros del Pueblo Mágico de Angangueo.

El santuario está abierto entre noviembre y marzo de 9 a 17 hrs. Antes de subir, entra a ver el video que explica la vida de esta hermosa mariposa y la increíble hazaña que realiza al viajar miles de kilómetros hasta aquí.

Puedes llegar por la carretera federal nº15 México-Toluca-Zitácuaro. Continúa desde Zitácuaro en dirección a Ciudad Hidalgo. En el entronque a la altura de San Felipe de los Alzati gira a la derecha en dirección a Angangueo. Puedes subir a El Rosario desde Ocampo o desde el centro de Angangueo.

Por la autopista nº 15D México-Morelia-Guadalajara, salir en Maravatío con rumbo a Ciudad Hidalgo. Antes del poblado de Irimbo tomar la desviación a mano izquierda rumbo a Aporo. Esta carretera termina en un entronque, gira a la izquierda en dirección a Angangueo o a la derecha en dirección a Ocampo. Desde cualquiera de los pueblos se accede al santuario.

Por la autopista nº 15D México-Morelia-Guadalajara, sal en la caseta de cobro de Contepec con rumbo a Tlalpujahua. Desde allí toma la carretera a Maravatío. En el pueblo de Santa María, toma el entronque a la izquierda en dirección a Angangueo. Cuando llegues este Pueblo Mágico toma el camino hacia El Rosario.

Sierra Chincua, en Angangueo, Michoacán:

La visita al santuario se realiza con un guía local que te llevará desde el centro de visitantes hasta las colonias de mariposas subiendo por un camino forestal, ya sea a pie o a caballo. Al igual que todos los santuarios, cuenta con instalaciones ecológicas, restaurantes, tiendas de artesanías y actividades de aventura.

Puedes llegar por la carretera federal nº15 México-Toluca-Zitácuaro. Continúa desde Zitácuaro en dirección a Ciudad Hidalgo. En el entronque a la altura de San Felipe de los Alzati gira a la derecha en dirección a Angangueo. Atraviesa este Pueblo Mágico y continúa unos kilómetros por la carretera que sube por la montaña. La entrada a Sierra Chincua está a la izquierda.

Por la autopista nº 15D México-Morelia-Guadalajara, salir en Maravatío con rumbo a Ciudad Hidalgo. Antes del poblado de Irimbo tomar la desviación a mano izquierda rumbo a Aporo. Esta carretera termina en un entronque, gira a la izquierda en dirección a Angangueo. Atraviesa este Pueblo Mágico y continúa unos kilómetros por la carretera que sube por la montaña. La entrada a Sierra Chincua está a la izquierda.

Por la autopista nº 15D México-Morelia-Guadalajara, sal en la caseta de cobro de Contepec con rumbo a Tlalpujahua. Desde allí toma la carretera a Maravatío. En el pueblo de Santa María, toma el entronque a la izquierda en dirección a Angangueo. Antes de llegar a este Pueblo Mágico encontrarás la entrada a Sierra Chincua a la derecha.

Senguio, en el municipio del mismo nombre, en Michoacán:

Se ubica dentro del Santuario Sierra Chincua.

Llegas por la autopista nº 15D México-Morelia-Guadalajara, sal en Maravatío con rumbo a Tlalpujahua. Pasando la presa del Fresno, a tu derecha encontrarás el entronque con la carretera 52 en dirección a Senguio.

Recuerda que las visitas a los santuarios se realizarán bajo estrictas medidas de seguridad e higiene, las cuales deberán atender todos los turistas y los prestadores de servicio, con el propósito de ofrecer una estancia segura y responsable.

La Mesa, en Sierra Campanario, Estado de México:

El ejido posee un criadero de venado abierto a los turistas y cabañas para pernoctar y observar el cielo en las noches.

Puedes llegar por la carretera que sale de Villa Victoria hacia El Oro o viceversa, de manera que se puede llegar por Toluca-Villa Victoria o por Toluca-Atlacomulco- El Oro, respectivamente. En la Parada de Guadalupe se ingresa hacia el predio de La Mesa.

Desde Michoacán, puedes acceder por San Felipe de los Alzati y seguir a través de Ocampo, Angangueo y San José del Rincón hasta entroncar hacia la derecha con la carretera El Oro-Villa Victoria. En la “Parada de Guadalupe” se ingresa hacia La Mesa.

El Capulín, en el cerro Pelón, municipio de Donato Guerra, Estado de México:

En este espacio se puede apreciar el llano de Los Tres Gobernadores y debido a la posición del acceso y de las colonias de hibernación es posible observar una transición de la vegetación que resulta atractiva para quienes gustan de la naturaleza.

El recorrido es de cuatro kilómetros y va acompañado de bellos paisajes de bosques de coníferas. Se recomienda seguir las indicaciones e instrucciones de los guías locales, caminar sólo por los senderos establecidos y no introducir a los santuarios alimentos, bebidas alcohólicas, objetos punzo-cortantes, armas de fuego ni mascotas.

Hay que llegar a Toluca y tomar la Carretera Federal No. 15 con dirección a Morelia. Llega a Villa Victoria y 15 Km. después, en el monumento a Miguel Alemán, sigue los señalamientos hacia Valle de Bravo (izquierda). A unos 20 Km. se encuentra la desviación (derecha) hacia la ciudad de Donato Guerra, después de la cual está el Santuario El Capulín.

San Mateo Almomoloa, en Piedra Herrada, Estado de México:

Las actividades permitidas son de bajo impacto ambiental: filmaciones, fotografías, investigación científica, monitoreo ambiental o la restauración de los ecosistemas.

El paraje recibe presupuesto y atención de la Comisión Nacional de Áreas Naturales Protegidas (Conanp), de las secretarías de Turismo y de Medio Ambiente estatales, ayuntamientos, además de organizaciones internacionales.

Se localiza a 26 km. del destino turístico Valle de Bravo, Estado de México, en los bosques del pueblo San Mateo Almomoloa, que pertenece al municipio de Temascaltepec.

Se recomienda permanecer en silencio durante la estancia en el Santuario, no usar flash para tomar fotografías y no molestar, sujetar o capturar mariposas.
            """.trimIndent()
        ),
        Place(
            name = "Morelia",
            photos = listOf(
                R.drawable.morelia_1,
                R.drawable.morelia_2,
                R.drawable.morelia_3,
                R.drawable.morelia_4,
                R.drawable.morelia_5
            ),
            hotels = listOf(
                Place.Item(title = "Grand Cantalagua Hotel Morelia, BW Signature", text = "Morelia, Zona Sin Asignación de Nombre de Colonia\nA 1.69 km del centro", rate = 8.8f),
                Place.Item(title = "Hotel Vista Express Morelia By Arriva Hospitality Group", text = "Morelia, Centro Histórico\nA 629 m del centro", rate = 7.7f),
                Place.Item(title = "Holiday Inn Morelia, an IHG Hotel", text = "Morelia, Centro Histórico\nA 3.39 km del centro", rate = 8.4f),
                Place.Item(title = "Gamma Morelia Beló", text = "Morelia, Cinco de Diciembre\nA 2.83 km del centro", rate = 8.6f),
                Place.Item(title = "Hotel Plaza Morelia", text = "Morelia, Centro Histórico\nA 1.22 km del centro", rate = 6.4f),
                Place.Item(title = "Hotel Allende Morelia", text = "Morelia, Molino de Parras\nA 1.37 km del centro", rate = 6.8f),
                Place.Item(title = "Hotel Grand Belo Morelia", text = "Morelia, Lomas de Hidalgo\nA 2.93 km del centro", rate = 8.2f),
                Place.Item(title = "Hotel Casa de La Loma", text = "Morelia, Centro Histórico\nA 2.14 km del centro", rate = 8.4f)
            ),
            restaurants = listOf(
                Place.Item(title = "Restaurante 1900", text = "Calle Moneda s/n Plaza de la Constitución, Tlalpan", rate = 4.5f),
                Place.Item(title = "A Los Arcos", text = "A 5.7 km de Santuario de la Mariposa Monarca Sierra Chincua", rate = 3.5f),
                Place.Item(title = "Pinche Chilango", text = "Miguel Hidalgo 18 Ocampo Michoacan", rate = 4.0f),
                Place.Item(title = "La Rockola", text = "A 5.6 km de Santuario de la Mariposa Monarca Sierra Chincua", rate = 4.2f),
                Place.Item(title = "Ciber Gloria", text = "A 16 km de Santuario de la Mariposa Monarca Sierra Chincua", rate = 4.3f)
            ),
            moreData = """
La ciudad de Morelia es uno de los destinos turísticos más bellos e importantes de México por su invaluable patrimonio cultural e histórico. Es considerada la cuna ideológica del Movimiento de Independencia y es sede de conocidos festivales internacionales de música y cine.
    El espíritu de la Antigua Valladolid (1514) se conserva hasta nuestros días y para los vacacionistas es un deleite de recreación y esparcimiento. Gracias a su belleza arquitectónica, el Centro Histórico de Morelia ha sido distinguido entre las casi 200 ciudades del mundo reconocidas por la UNESCO como “Patrimonio Cultural de la Humanidad”.
    
    Morelia ofrece una gran variedad de atractivos para el visitante: desde la admiración, tranquilidad y armonía de sus edificaciones ancestrales de cantera rosada, su amplia variedad gastronómica (una de las cocinas más ricas y diversas de México), hasta su vasta gama de leyendas, tradiciones, bailes y artesanías, que hacen de esta ciudad uno de los mejores destinos para vacacionar.
    
    El paseo a pie por la Calzada de Guadalupe permite disfrutar de una de las avenidas más seductoras de la ciudad. La belleza de Morelia se acentúa en la noche con la iluminación de tres de sus monumentos más representativos: La Catedral, el Antiguo Colegio de San Nicolás y el Acueducto.
    Ver video promocional de Morelia
    
    Un poco de Historia
    Morelia es la capital de Michoacán y cabecera del municipio del mismo nombre. La ciudad fue fundada por el Virrey Don Antonio de Mendoza el 18 de mayo de 1541, con el nombre original de “Nueva Ciudad de Michoacán”, que cambió a “Valladolid” en 1578. Pero desde 1828 se llama “Morelia” en honor a su hijo Don José María Morelos y Pavón, héroe de la Independencia de México.
    
    El pueblo de los matlalzincas se estableció en el valle de Guayangareo durante los siglos XIV o XV, en lo que hoy es Morelia, en un territorio que aparentemente les fue concedido como recompensa por haber participado en la defensa del imperio purépecha durante la invasión de los tecos de Jalisco. Se sabe que al instalarse en el mencionado valle, cuyo significado es "loma chata y alargada", los matlalzincas recibieron el nombre de "pirindas", es decir "los de en medio", debido a la ubicación del lugar que ellos llamaron Patzinyegui.
    
    Como en toda población indígena de la época la huella evangelizadora de España se hizo notar de manera decidida, en este caso fueron los franciscanos fray Juan de San Miguel y fray Antonio de Lisboa quienes formaron una escuela de catecismo, llamada San Miguel, en donde también fue transmitida la enseñanza de la música y las artes en general, entre otros tantos oficios. Con aquel intercambio de culturas, dio inicio una etapa de notable florecimiento para el valle de Patzinyegui, lugar que años más tarde sería designado por el virrey Antonio de Mendoza como punto para la fundación de la ciudad, misma que acogió a muchos españoles avecindados en tierras michoacanas. Fueron sesenta familias de colonizadores, nueve frailes y algunos indígenas los que dieron forma un 18 de mayo de 1541 al Acta de Fundación de Valladolid, la cual recibiría el título de ciudad por distinción del rey Carlos I de España en 1545.
    
    Desde aquel entonces Valladolid ha tenido una importancia sociocultural notable, no sólo para la evolución del Estado de Michoacán, sino para México mismo. Entre los distinguidos alumnos de esa ciudad figuraron notables personajes que influyeran en el curso de la historia nacional, como Don Miguel Hidalgo y Costilla, el botánico y estadista Juan José Martínez de Lejarza; Mariano Michelana, uno de los precursores del movimiento de independencia, así como dos de sus heroicos ejecutores, José María Morelos y Pavón y Agustín de Iturbide; Melchor Ocampo, principal inspirador de las Leyes de Reforma en 1857, entre tantos otros destacados personajes.
    
    Patrimonio Cultural de la Humanidad
    El 12 de diciembre de 1991, la UNESCO inscribió a Morelia en la lista del Patrimonio. El Centro Histórico es la ciudad mexicana con más edificios catalogados como monumentos arquitectónicos (posee 1,113 y de ellos 260 fueron señalados como relevantes), de tal manera que visitarla ofrece la garantía de un recorrido enriquecedor por su valor histórico y arquitectónico amplio y variado.
    Estos inmuebles se asientan sobre una suave loma de cantera que abarca 390 hectáreas distribuidas en 219 manzanas con 15 plazas que se convierten en remansos para el visitante.
    
    Los espacios de la ciudad son un conjunto de gran valor por sus características formales de edificación, armonía volumétrica, calidad constructiva y unidad plástica en que se presentan los diferentes estilos arquitectónicos desarrollados a través de los siglos, lo que permito consolidad un estilo local, como elocuente testimonio para la historia arquitectónica de la nación.
    El más evidente rasgo arquitectónico único de Morelia es la peculiar solución que se da en buen número de patios al eliminar las columnas o los apoyos verticales en las esquinas. La eliminación de las aristas, líneas y elementos constructivos verticales provoca una sensación de continuidad o dinamismo.
    
    Otra característica es su ornamentación exterior conocida como “barroco moreliano”, donde los elementos decorativos escultóricos y vegetales dominan los planos y las líneas de tableros y molduras. Las calles y plazas de la capital michoacana se apegan a la forma de retícula irregular y muchas de ellas rematan con un monumento que origina espectaculares perspectivas.
    
    En su declaración, la UNESCO consideró que algunas de las perspectivas urbanas del Centro Histórico de Morelia constituyen “un modelo único en América”. Estimó también que la arquitectura monumental de la ciudad se caracteriza por su estilo calificado como “barroco moreliano”, por la originalidad de sus expresiones locales que se plasman en el Acueducto, la Catedral Metropolitana, en el conjunto de la iglesia de la Compañía y el ex Colegio Jesuita así como en las fachadas y las arcadas de los corredores y patios de las casas Vallisoletanas.
    Por otra parte señaló que la diversidad de estilos va desde tipologías arquitectónicas de finales del siglo XVI, donde el aspecto de fortaleza medieval convive con elementos renacentistas, barrocos y el neoclásico hasta llegar al eclecticismo y afrancesamiento del periodo de Porfirio Díaz.
            """.trimIndent()
        ),
        Place(
            name = "Paricutín",
            photos = listOf(
                R.drawable.paricutin_1,
                R.drawable.paricutin_2,
                R.drawable.paricutin_3,
                R.drawable.paricutin_4,
                R.drawable.paricutin_5
            ),
            hotels = listOf(
                Place.Item(title = "Hostel Paricutín", text = "A 1.43 km del centro", rate = 0f),
                Place.Item(title = "Holiday Inn Uruapan, an IHG Hotel", text = "A 1.83 km del centro", rate = 8.8f),
                Place.Item(title = "Hotel Plaza Uruapan", text = "A 1.53 km del centro", rate = 9.0f),
                Place.Item(title = "Hotel Pie de la Sierra", text = "A 3.84 km del centro", rate = 8.2f),
                Place.Item(title = "Hotel Mi Solar Ejecutivo", text = "A 1.48 km del centro", rate = 9.2f),
                Place.Item(title = "Hotel Monarca", text = "A 803 m del centro", rate = 7.0f),
                Place.Item(title = "Hotel Concordia", text = "A 1.41 km del centro", rate = 7.8f),
                Place.Item(title = "Mansión del Cupatitzio", text = "A 2.80 km del centro", rate = 9.0f),
                Place.Item(title = "El salto de Camela", text = "A 1.63 km del centro", rate = 0f),
                Place.Item(title = "Hotel Villa de Flores", text = "A 1.64 km del centro", rate = 8.4f),
                Place.Item(title = "Hotel El Tarasco", text = "A 3.77 km del centro", rate = 0f),
                Place.Item(title = "Paseo Real Hotel Boutique", text = "A 2.11 km del centro", rate = 10.0f),
                Place.Item(title = "Hotel Mi Solar", text = "A 1.48 km del centro", rate = 9.0f),
                Place.Item(title = "Hotel Los Cedros", text = "A 2.05 km del centro", rate = 8.2f),
                Place.Item(title = "Casa Chikita Bed & Breakfast", text = "A 1.77 km del centro", rate = 9.2f),
                Place.Item(title = "Hotel Regis", text = "A 1.43 km del centro", rate = 7.9f),
                Place.Item(title = "Hotel Jani", text = "A 2.67 km del centro", rate = 6.4f),
                Place.Item(title = "Moderna y Espaciosa Casa a 5 Minutos del Aeropuerto", text = "A 1.76 km del centro", rate = 0f),
                Place.Item(title = "Hermosa y moderna casa que te ofrece una relajada estadía", text = "A 1.58 km del centro", rate = 0f),
                Place.Item(title = "Comoda y Agradable Habitación con Baño Privado", text = "A 471 m del centro", rate = 0f)
            ),
            restaurants = listOf(
                Place.Item(title = "Hostel Paricutín", text = "A 1.43 km del centro", rate = 4.2f),
                Place.Item(title = "Holiday Inn Uruapan, an IHG Hotel", text = "A 1.83 km del centro", rate = 8.8f),
                Place.Item(title = "Hotel Plaza Uruapan", text = "A 1.53 km del centro", rate = 9.0f),
                Place.Item(title = "Hotel Pie de la Sierra", text = "A 3.84 km del centro", rate = 8.2f),
                Place.Item(title = "Hotel Mi Solar Ejecutivo", text = "A 1.48 km del centro", rate = 9.2f)
            ),
            moreData = """
    El Paricutín (en purépecha Parhíkutini, 'lugar al otro lado') es un volcán inactivo situado en el estado de Michoacán, México, entre el ex poblado de San Juan Parangaricutiro (actualmente Nuevo San Juan Parangaricutiro) y el poblado de Angahuan. Surgido el 20 de febrero de 1943 a las 4 de la tarde, en su momento ostentó el título del volcán más joven del mundo.

    Historia
    El día 20 de febrero de 1943, Dionisio Pulido, un campesino, se encontraba trabajando la tierra en las cercanías del pueblo Parangaricutiro, cuando de pronto el suelo empezó a temblar, se abrió la tierra y empezó a emanar un vapor muy espeso, a sonar muy fuerte y a volar piedras. Muy asustado, el señor Pulido avisó al pueblo.
    La duración de la actividad de este volcán fue de nueve años, 11 días y 10 horas. La lava recorrió unos 10 kilómetros. No hubo víctimas humanas, dado que hubo suficiente tiempo para desalojar a toda la población. El volcán solo sepultó dos poblados: Paricutín y San Juan Parangaricutiro (Parhikutini y Parangarikutirhu en purépecha). El primero quedó totalmente borrado del mapa. Muy cerca de él se encuentra ahora el cráter del volcán. Del segundo pueblo solo es visible parte de la iglesia, sepultada por la lava, al igual que el resto del pueblo, excepto por la torre izquierda del frente (la torre derecha aparentemente cayó pero lo cierto es que estaba en construcción en el momento de empezar el fenómeno) así como el ábside, junto con el altar.

    Este volcán monogenético, es decir, que nace una sola vez y tiene una corta erupción que puede durar desde meses hasta varios años, marcó un acontecimiento histórico y significativo en la vulcanología tanto en México como a nivel mundial. Esto debido a que el volcán sirvió como un modelo de estudio para futuras erupciones y permitió a los científicos comprender mejor los procesos volcánicos.

    El periodo Quitzocho
    La actividad se concentró alrededor de las grietas que se formaron en el Valle de Cuiyusuru. Lo más relevante de este periodo fue la formación de un cono prematuro seguido de flujos de lava recurrentes y la erupción intermitente de bombas y lapilli.
    En esta etapa, el cono alcanzó 200 y 365 metros de altura en cuatro y ocho meses respectivamente.
    Se desalojó a la población de Paricutín en junio de 1943, y la de Santa Ana Zirosto se reubicó pocos meses después.
    El 10 de mayo de 1944, los habitantes abandonaron San Juan Parangaricutiro, emprendiendo una caminata de 33 kilómetros, en la que llevaron una imagen del Señor de los Milagros. El 23 de mayo de 1944 llegaron a la exhacienda de los Conejos, a 8 kilómetros de Uruapan, donde determinaron establecer el nuevo poblado de Nuevo San Juan Parangaricutiro, constituido en municipio en 1950.

    El periodo Sapichu
    A pesar de su corta duración, en este periodo se llevó a cabo la principal actividad de derrames de lava del volcán, orientada hacia el norte. Su emplazamiento se produjo por la formación de una serie de grietas y conductos secundarios, de los cuales el más importante fue sin duda alguna el Sapichu ("niño" o "joven", en purépecha).

    El periodo Taquí Ahuan
    Se refiere a la actividad relacionada con una serie de grietas formadas al sur y al este del cono principal, conocidas por los geólogos de la época como Taquí y Ahuan.
    Este período se distingue, además, por registrar una reactivación del cono principal, que causó los principales derrames de lava, que alcanzaron la máxima distancia al oeste y al noroeste del cono principal.
    Hasta el final mantuvo una actividad de tipo paroxismal, y son destacables la formación de la mesa Los Hornitos (al sur del cono) y los flujos de San Juan formados entre abril y agosto de 1944. De hecho, este último flujo causó la evacuación y la sucesiva destrucción del poblado de San Juan Parangaricutiro (con 1895 habitantes).
            """.trimIndent()
        ),
    )
}