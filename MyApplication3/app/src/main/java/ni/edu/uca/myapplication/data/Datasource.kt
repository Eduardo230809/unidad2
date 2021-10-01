package ni.edu.uca.myapplication.data

import ni.edu.uca.myapplication.R
import ni.edu.uca.myapplication.afirmacion


class Datasource {
    fun loadAffirmations(): List<afirmacion> {
        return listOf<afirmacion>(
            afirmacion(R.string.affirmation1, R.drawable.image1),
            afirmacion(R.string.affirmation2, R.drawable.image2),
            afirmacion(R.string.affirmation3, R.drawable.image3),
            afirmacion(R.string.affirmation4, R.drawable.image4),
            afirmacion(R.string.affirmation5, R.drawable.image5),
            afirmacion(R.string.affirmation6, R.drawable.image6),
            afirmacion(R.string.affirmation7, R.drawable.image7),
            afirmacion(R.string.affirmation8, R.drawable.image8),
            afirmacion(R.string.affirmation9, R.drawable.image9),
            afirmacion(R.string.affirmation10, R.drawable.image10)
        )
    }
}
