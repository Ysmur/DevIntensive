package com.softdesign.devintensive.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.softdesign.devintensive.R;
import com.softdesign.devintensive.utils.ConstantManager;

public class MainActivity extends AppCompatActivity {

   private  static final String TAG= ConstantManager.TAG_PREFIX+"Main Activity";


   /**
    * метод вызывается при создании активити (после изменений конфигурации/возврата к текущей
    * активности после его уничтожения.
    *
    * в данном методе инициализируются/производится:
    * - UI пользовательский интерфейс (статика)
    * - инициализация статических данных активити
    * - связь данных со списками (инициализация адаптеров)
    *
    * Не запускать длительные операции по работе с данными в onCreate() !!!
    *
    * @param savedInstanceState - объект со значениями сохраненными в Bundle - состояние UI
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");

        if (savedInstanceState==null){
            // активити запускается впервые
        }else {
            // активити уже создавалось
        }


    }

    /**
     * метод вызывается при старте активити перед моментом того как UI станет доспупен пользователю
     * как правило в данном методе происходит регистрация подписки на события остановка которых была
     * произведена в onStop()
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    /**
     * Метод вызывается когда активити становится доступна пользователю для взаимодействия
     * в данном методе как правило происходит запуск анимаций/аудио/видео/запуск BroadcastReceiver
     * необходимых для реализации UI логики/запуск выполнения потоков и т. п.
     * метод должен быть максимально легковесным для максимальной отзывчивости UI
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    /**
     * метод вызывается тогда, когда текущая активити теряет фокус но остается видимой (всплытие
     * диалогового окна/частичное перекрытие другой активити и т.п.)
     *
     * в данном методе реализуется сохранение легковесных UI данных/анимаций/аудио/видео и т.д.)
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    /**
     * метод вызывается когда активити становится невидимым для пользователя.
     * в данном методе происходит отписка от событий, остановка сложных анимаций, сложные операции по
     * сохранению данных/прерываение запущенных потоков и т.п.
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    /**
     * метод вызывается при окончании работы активити (когда это происходит системно или после вызова
     * метода finish() )
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    /**
     * метод вызывается при рестарте активити/возобновлении работы после вызова метода onStop()
     * в данном методе реализуется специфическая бизнес логика которая должна быть реализована именно
     * при рестарте активности - например, запрос к серверу, которые необходимо вызывать при возвращении
     * из другой активности (обновление данных, подписка на определенное событие проинициализированное
     * на другом экране/специфическая бизнес логика завязанная именно на перезапуске активити)
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }
}
