package me.tulio.lagrasabot;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@RequiredArgsConstructor
public enum FCL {

    GABRIEL_ARIAS("Gabriel Arias", "https://s.hs-data.com/bilder/spieler/gross/99581.jpg"),
    GUILLERMO_MARIPAN("Guillermo Maripán", "http://t2.gstatic.com/licensed-image?q=tbn:ANd9GcQYa8dVQrGvIF9tm_E9BGEOfxP9Ie4uU3IpZlrb3Flu2MsLvu1ZmK_G6N69bMVS"),
    BEN_BRERETON("Ben Brereton", "https://www.encancha.cl/u/fotografias/m/2021/6/19/f608x342-96884_126607_9.png"),
    ALEXIS_SANCHEZ("Alexis Sánchez", "https://www.futuro.cl/wp-content/uploads/2021/08/alexis-sanchez-768x404.jpg"),
    ARTURO_VIDAL("Arturo Vidal", "https://upload.wikimedia.org/wikipedia/commons/a/a2/Chile_VS._Australia_%2813%29_2017-6-25_Arturo_Vidal.jpg"),
    EDUARDO_VARGAS("Eduardo Vargas", "http://t2.gstatic.com/licensed-image?q=tbn:ANd9GcTdGb-9xU96MKmy3_U5SSFeqImvnbQkR2zJ4DStH8qqv1YAlMcUj0R9RRLB0Fbg"),
    ERICK_PULGAR("Erick Pulgar", "http://t3.gstatic.com/licensed-image?q=tbn:ANd9GcTi3wD3xJ9Syc1ppfvqdPw_WP5L8iDDbVP9yldgp4YyxDyX-AFrDm2TzTCVTDxu"),
    CLAUDIO_BRAVO("Claudio Bravo", "https://upload.wikimedia.org/wikipedia/commons/4/44/Chile_VS._Australia_%281cropped%29.jpg"),
    GARY_MEDEL("Gary Medel", "http://t0.gstatic.com/licensed-image?q=tbn:ANd9GcRvtvuulgufDwULrzMFtfdUKCFneCf6JcYjJEHYmdR7dTWSw1crsEIRmiSdOxwY"),
    FRANCISCO_SIERRALTA("Francisco Sierralta", "https://anfpfotos.cl/size/357x430/a/jugadores/ab2b959f5760dbcd4022a4c143cfedf2.jpg"),
    JEAN_MENESES("Jean Meneses", "https://2.bp.blogspot.com/-hhxBzBhAEv4/Xh_Ae5cz5iI/AAAAAAAAbuU/sO8meXyRSawsacT9WZofVu_cdqkKa92EQCNcBGAsYHQ/s1600/jean-meneses-chile-2019.jpg"),
    MAURICIO_ISLA("Mauricio Isla", "https://anfpfotos.cl/size/357x430/a/jugadores/48de6e9d33638853b6dd60915917d6b9.jpg"),
    CHARLES_ARANGUIZ("Charles Aránguiz", "http://t0.gstatic.com/licensed-image?q=tbn:ANd9GcQQmDjf9zQcY65GkLNXF4oa4heJlTYwED5fbsJZWWgV9HF1SR3ZzOyoaLOBMeks"),
    TOMAS_ALARCON("Tomás Alarcón", "https://1.bp.blogspot.com/-5bP8xiJjk3s/XXcgXdGI4BI/AAAAAAAAbPU/SZzLr80xiCANH73RDihM6N2p4oBzFZh_ACLcBGAs/s1600/tomas-alarcon-chile.jpg"),
    FABIAN_ORELLANA("Fabián Orellana", "https://3.bp.blogspot.com/-J8qYLap6P6I/WETzJg0ORWI/AAAAAAAAD3c/42iF08UBth4MIoCcgP1c05Pmu_tLvMtXwCLcB/s1600/fabian-orellana-chile-2016.jpg"),
    LUCIANO_ARRIAGADA("Luciano Arriagada", "https://cloudfront-us-east-1.images.arcpublishing.com/copesa/SUOWO6G6EZDJVIAOLR2LJUXEEA.jpg"),
    JEAN_BEAUSEJOUR("Jean Beausejour", "http://t0.gstatic.com/licensed-image?q=tbn:ANd9GcQy6vtB4ZRJ1OPy7_y1hTrkp__OsAAQRn93E3OkWdaCiBbN1RWap1kx0fylWlWe"),
    PAULO_DIAZ("Paulo Díaz", "http://t0.gstatic.com/licensed-image?q=tbn:ANd9GcSgQHhlWcXu8oplMZYXqubge5-DO26bFydaCvR3dWn-ttYGy35On-JtNrmn_V5y");

    public final String name;
    public final String link;

    public static List<FCL> getList() {
        return Arrays.asList(FCL.values());
    }
}
