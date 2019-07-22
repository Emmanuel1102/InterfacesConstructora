import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;


public class GraficaIntento extends ApplicationFrame {


public GraficaIntento(final String title) {

    super(title);
    final XYSeries series = new XYSeries("Ventas mensuales");
    //El primer numero es el mes en el eje x las otros cifras son ganancias en el eje y
    series.add(1, 500.2);
    series.add(2, 694.1);
    series.add(3, 100.0);
    series.add(4, 734.4);
    series.add(5, 453.2);
    series.add(6, 500.2);
    series.add(7, 500.00);
    series.add(8, 734.4);
    series.add(9, 453.2);
    series.add(10, 453.2);
    series.add(11, 453.2);
    series.add(12, 453.2);
    final XYSeriesCollection data = new XYSeriesCollection(series);
    
    final JFreeChart chart = ChartFactory.createXYLineChart(
        "Gráficas de ventas mensuales",
        "Meses", 
        "Ganancias", 
        data,
        PlotOrientation.VERTICAL,
        true,
        true,
        false
    );

    final ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
    setContentPane(chartPanel);

        
}


public static void main(final String[] args) {

    final GraficaIntento demo = new GraficaIntento("Gráfica finanzas");

    demo.pack();
    RefineryUtilities.centerFrameOnScreen(demo);
    demo.setVisible(true);

}

}