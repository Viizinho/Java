import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class ItemMusical {
    private String nome;

    public ItemMusical(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}

class Musica extends ItemMusical {
    private String artista;

    public Musica(String nome, String artista) {
        super(nome);
        this.artista = artista;
    }

    public String getArtista() {
        return this.artista;
    }
}

class Playlist {
    private String nome;
    private List<Musica> musicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void removerMusica(Musica musica) {
        musicas.remove(musica);
    }

    public void listarMusicas() {
        for (Musica musica : musicas) {
            System.out.println("Música: " + musica.getNome() + " - Artista: " + musica.getArtista());
        }
    }

    public List<Musica> getMusicas() {
        return this.musicas;
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Playlist> playlists = new HashMap<>();

        System.out.println("Bem-vindo ao Sistema de Gerenciamento de Músicas e Playlists!");

        int escolha;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Criar Playlist");
            System.out.println("2. Adicionar Música a uma Playlist");
            System.out.println("3. Remover Música de uma Playlist");
            System.out.println("4. Listar Músicas de uma Playlist");
            System.out.println("0. Sair");

            escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (escolha) {
                case 1:
                    System.out.println("Digite o nome da Playlist:");
                    String nomePlaylist = scanner.nextLine();
                    playlists.put(nomePlaylist, new Playlist(nomePlaylist));
                    System.out.println("Playlist " + nomePlaylist + " criada com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o nome da Playlist para adicionar a música:");
                    String nomePlaylistAdicionar = scanner.nextLine();
                    Playlist playlistAdicionar = playlists.get(nomePlaylistAdicionar);
                    if (playlistAdicionar != null) {
                        System.out.println("Digite o nome da música:");
                        String nomeMusica = scanner.nextLine();
                        System.out.println("Digite o nome do artista:");
                        String nomeArtista = scanner.nextLine();
                        playlistAdicionar.adicionarMusica(new Musica(nomeMusica, nomeArtista));
                        System.out.println("Música adicionada com sucesso à playlist " + nomePlaylistAdicionar);
                    } else {
                        System.out.println("Playlist não encontrada.");
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome da Playlist para remover a música:");
                    String nomePlaylistRemover = scanner.nextLine();
                    Playlist playlistRemover = playlists.get(nomePlaylistRemover);
                    if (playlistRemover != null) {
                        System.out.println("Digite o nome da música a ser removida:");
                        String nomeMusicaRemover = scanner.nextLine();
                        Musica musicaRemover = null;
                        for (Musica musica : playlistRemover.getMusicas()) {
                            if (musica.getNome().equals(nomeMusicaRemover)) {
                                musicaRemover = musica;
                                break;
                            }
                        }
                        if (musicaRemover != null) {
                            playlistRemover.removerMusica(musicaRemover);
                            System.out.println("Música removida com sucesso da playlist " + nomePlaylistRemover);
                        } else {
                            System.out.println("Música não encontrada na playlist.");
                        }
                    } else {
                        System.out.println("Playlist não encontrada.");
                    }
                    break;
                case 4:
                    System.out.println("Digite o nome da Playlist para listar as músicas:");
                    String nomePlaylistListar = scanner.nextLine();
                    Playlist playlistListar = playlists.get(nomePlaylistListar);
                    if (playlistListar != null) {
                        System.out.println("Músicas na playlist " + nomePlaylistListar + ":");
                        playlistListar.listarMusicas();
                    } else {
                        System.out.println("Playlist não encontrada.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 0);

        scanner.close();
    }
}
