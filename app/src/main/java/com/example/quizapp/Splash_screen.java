package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.ArrayList;

public class Splash_screen extends AppCompatActivity {

    public static ArrayList<model_class> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        list= new ArrayList<>();
        list.add(new model_class("1. Consider two satellites S1 and S2 with periods of revolution 1 hr and 8 hr respectively revolving around a planet in circular orbits. The ratio of angular velocity of satellite S1 to the angular velocity of satellite S2 is","8: 1","1: 8","2: 1","1: 4","8: 1"));
        list.add(new model_class("2. Two equal capacitors are first connected in series and then in parallel. The ratio of the equivalent capacities in the two cases will be","2:1","1:4"," 4:1","1:2","1:4"));
        list.add(new model_class("3. If Y, K and η are the values of Young’s modulus, bulk modulus and modulus of rigidity of any material respectively. Choose the correct relation for these parameters.","k = ((Y*n)/(9*n-3Y) Nm^-2)","n = ((3*Y*K)/(9K+Y)) Nm^-2","Y = ((9*Y*K)/(3*K-n)) Nm^-1","Y = ((9*K*n)/(2*n+3*K))","n = ((3*Y*K)/(9K+Y)) Nm^-2"));
        list.add(new model_class("4. The level of doping of emitter section of a transistor has to be","More than the collector and base.","Smaller than the collector and base.","lesser than the base region but greater than the collector region","More than base region only","More than the collector and base."));
        list.add(new model_class("5. A bipolar junction transistor when used as a switch, operates in","cut-off and active region","active and saturation region","cut-off and saturation region","all of these","cut-off and saturation region"));
        list.add(new model_class("6. A current through a wire depends on time as i = α0t + βt2 where α0 = 20 A/s and β = 8 As^-2. Find the charge crossed through a section of the wire in 15 s.","2100 C","260 C","2250 C"," 11250 C"," 11250 C"));
        list.add(new model_class("7. The focal length f is related to the radius of curvature r of the spherical convex mirror by:"," f = r"," f = - ½ r","f = +½ r","f = – r"," f = +½ r"));
        list.add(new model_class("8. If an emitter current is changed by 4mA, the collector current changes by 3.5 mA. The value of β will be","7","0.875","0.5","3.5","7"));
        list.add(new model_class("9. In Young’s double-slit experiment, the width of one of the slits is three times the other slit. The amplitude of the light coming from a slit is proportional to the slit-width. Find the ratio of the maximum to the minimum intensity in the interference pattern.","4: 1","2: 1","3: 1","1: 4","4: 1"));
        list.add(new model_class("10.Each side of a box made of metal sheet in cubic shape is ‘a’ at room temperature ‘T’, the coefficient of linear expansion of the metal sheet is ‘α’. The metal sheet is heated uniformly, by a small temperature ΔT, so that its new temperature is T+ΔT. Calculate the increase in the volume of the metal box:","4/3 πa^3αΔT","4πa^3αΔT","3a3αΔT","4a3αΔT","3a3αΔT"));
        list.add(new model_class("21.Which force is responsible for the stacking of the α-helix structure of protein? Hydrogen (1H, 2H, 3H) is ________","H-bond","Ionic bond","Covalent bond","Van der Waals forces","H-bond"));
        list.add(new model_class("12.The gas evolved due to anaerobic degradation of vegetation causes:","Global warming and cancer","Acid rain"," Ozone hole","Metal corrosion","Global warming and cancer"));
        list.add(new model_class("13.Which of the following pairs are isostructural. a)TiCl4,SiCl4 b)SO2-3,CrO2-3 c)NH3,NO-3 d)ClF3,BCl3","A,B","A,C"," B,C","A,D","A,B"));
        list.add(new model_class("14.Which of the following ores are concentrated by cyanide of group 1st element?","Sphalerite","Malachite","Calamine","Siderite","Sphalerite"));
        list.add(new model_class("15.S-1: Colourless cupric metaborate is converted into cuprous metaborate in a luminous flame.","S-1 is true and S-2 is false","S-1 is false and S-2 is true"," Both are false","Both are true","Both are false"));
        list.add(new model_class("16.EoM2+/ M has a positive value for which of the following elements of 3d transition series?","Cu","Zn","Cr","Co","Cu"));
        list.add(new model_class("17.The composition of gun metal is:","Cu, Zn, Sn","Al, Mg, Mn, Cu","Cu, Ni, Fe","Cu, Sn, Fe","Cu, Zn, Sn"));
        list.add(new model_class("18. 9.45g of CH2ClCOOH is dissolved in 500 mL of H2O solution and the depression in freezing point of the solution is 0.5°C. Find the percentage dissociation","34.3%","34.4%","34.5%","35.5%","34.4%"));
        list.add(new model_class("19.What is the coordination number in Body Centered Cubic (BCC) arrangement of identical particles?","2","4","6","8","8"));
        list.add(new model_class("20.Among the following compounds, how many are amphoteric in nature? Be(OH)2, BeO, Ba(OH)2, Sr(OH)2","1","2","3","4","2"));
        list.add(new model_class("21. The locus of the mid-point of the line segment joining the focus of the parabola y2 = 4ax to a moving point of the parabola, is another parabola whose directrix is:"," x = a","x = 0","x = -a/2"," x = a/2"," x = 0"));
        list.add(new model_class("22. A scientific committee is to formed from 6 Indians and 8 foreigners, which includes at least 2 Indians and double the number of foreigners as Indians. Then the number of ways, the committee can be formed is:"," 560","1050","1625","5752"," 1625"));
        list.add(new model_class("23.The equation of the plane passing through the point (1,2,–3) and perpendicular to the planes 3x + y – 2z = 5 and 2x – 5y – z = 7, is:","3x – 10y – 2z + 11 = 0","6x – 5y – 2z – 2 = 0","11x + y + 17z + 38 = 0","6x – 5y + 2z + 10 = 0","11x + y + 17z + 38 = 0"));
        list.add(new model_class("24.The statement among the following that is a tautology is:"," A∧(A∨B)"," B→[A∧(A→B)]","A∨(A∧B","  [A∧(A→B)]→B","[A∧(A→B)]→B"));
        list.add(new model_class("25.Let f :R→R be defined as f(x) = 2x-1 and g:R - {1} →R be defined as g(x) = (x-½)/(x-1). Then the composition function f(g(x)) is:","Both one-one and onto","onto but not one-one","Neither one-one nor onto","one-one but not onto","one-one but not onto"));
        list.add(new model_class("26.If f:R→ R is a function defined by f(x) = [x - 1] cos ((2x - 1)/2)PI , where [.] denotes the greatest integer function, then f is:","discontinuous only at x = 1"," discontinuous at all integral values of x except at x = 1"," continuous only at x = 1","continuous for every real x","continuous for every real x"));
        list.add(new model_class("27.Two vertical poles are 150 m apart and the height of one is three times that of the other. If from the middle point of the line joining their feet, an observer finds the angles of elevation of their tops to be complementary, then the height of the shorter pole (in meters) is:"," 25","20√3","30","25√3","25√3"));
        list.add(new model_class("28.If the tangent to the curve y = x3 at the point P(t, t3) meets the curve again at Q, then the ordinate of the point which divides PQ internally in the ratio 1:2 is:","–2t3","–t3","0"," 2t3","–2t3"));
        list.add(new model_class("29.The area (in sq.units) of the part of the circle x2 + y2 = 36, which is outside the parabola y2 = 9x, is:","24π + 3√3"," 12π + 3√3","12π - 3√3","24π - 3√3","24π - 3√3"));
        list.add(new model_class("30. The population P = P(t) at time ‘t’ of a certain species follows the differential equation dP/dt = 0.5P - 450. If P(0) = 850, then the time at which population becomes zero is:","½ loge 18","2loge 18","loge 9","loge 18","2loge 18"));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash_screen.this,RegistrationPage.class));
            }
        },2000);
    }
}