public class Mascotas {
    public class Juego
    {

        public enum Especie
        {
            CacatuaBlanca,
            BoaConstrictor,
            TitiDorado,
            GuacamayaRoja
        }

        private Especie Especie;

        private int vidapromedio;

        private int precio;

        private int cantidadespecies;

        private int cantidadVendidas;

        private int tamano;

        public Mascota( Especie pespecie, int ptamanio, int pPrecio, int pVidaPromedio , int pCantidadEspecies, int pcantidadvendidas)
        {
            Especie = pespecie;
            precio = pPrecio;
            vidapromedio = pVidaPromedio;
            cantidadespecies = pCantidadEspecies;
            cantidadVendidas = 0;
            tamano = ptamanio;

        }

        public Especie Especie( )
        {
            return Especie;
        }

        public darVidaPromedio( )
        {
            return vidapromedio;
        }


        public int darPrecio( )
        {
            return precio;
        }

        public int dar tamano( )
        {
            return tamano;
        }


        public int darCantidadespecies( )
        {
            return cantidadespecies;
        }


        public int darCantidadVendidas( )
        {
            return cantidadVendidas;
        }





