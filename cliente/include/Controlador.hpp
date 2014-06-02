
#ifndef CONTROLADOR_HPP
#define CONTROLADOR_HPP

// Qt
#include <QObject>

class Controlador : public QObject
{
  Q_OBJECT
public:
    Controlador(QObject* parent = 0);
    ~Controlador();
};

#endif
