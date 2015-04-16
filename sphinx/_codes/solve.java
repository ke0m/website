  private void solve(Operator2 a, float[][] b, float[][] x) {
    int n1 = b[0].length;
    int n2 = b.length;
    float[][] d = new float[n2][n1];
    float[][] q = new float[n2][n1];
    float[][] r = new float[n2][n1];
    scopy(b,r);
    a.apply(x,q);
    saxpy(-1.0f,q,r); // r = b-Ax
    scopy(r,d); // d = r
    float delta = sdot(r,r); // delta = r'r
    float bnorm = sqrt(sdot(b,b));
    float rnorm = sqrt(delta);
    float rnormBegin = rnorm;
    float rnormSmall = bnorm*_small;
    int iter;
    log.fine("solve: bnorm="+bnorm+" rnorm="+rnorm);
    for (iter=0; iter<_niter && rnorm>rnormSmall; ++iter) {
      log.finer("  iter="+iter+" rnorm="+rnorm+" ratio="+rnorm/rnormBegin);
      a.apply(d,q); // q = Ad
      float dq = sdot(d,q); // d'q = d'Ad
      float alpha = delta/dq; // alpha = r'r/d'Ad
      saxpy( alpha,d,x); // x = x+alpha*d
      saxpy(-alpha,q,r); // r = r-alpha*q
      float deltaOld = delta;
      delta = sdot(r,r); // delta = r'r
      float beta = delta/deltaOld;
      sxpay(beta,r,d); // d = r+beta*d
      rnorm = sqrt(delta);
    }
    log.fine("  iter="+iter+" rnorm="+rnorm+" ratio="+rnorm/rnormBegin);
  }
