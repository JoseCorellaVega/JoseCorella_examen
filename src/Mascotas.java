public class Mascotas {
    public class Juego {

        public enum Especie {
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

        private int edad;

        public void Mascotas(Especie pespecie, int ptamano, int pPrecio, int pVidaPromedio, int pCantidadEspecies, int pCantidadVendidas, int pedad) {
            Especie = pespecie;
            precio = pPrecio;
            vidapromedio = pVidaPromedio;
            cantidadespecies = pCantidadEspecies;
            cantidadVendidas = 0;
            tamano = ptamano;
            edad = pedad;
        }

        public Especie Especie() {
            return Especie;
        }

        public int VidaPromedio() {
            return vidapromedio;
        }

        public int darPrecio() {
            return precio;
        }

        public int dartamano() {
            return tamano;
        }

        public int darCantidadespecies() {
            return cantidadespecies;
        }

        public int darCantidadVendidas() {
            return cantidadVendidas;
        }
    }}






