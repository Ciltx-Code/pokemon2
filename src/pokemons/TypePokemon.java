package pokemons;

public enum TypePokemon {
	EAU("Eau"), FEU("Feu"), PLANTE("Plante");

	private String nom;

	private TypePokemon(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return this.nom;
	}
}
