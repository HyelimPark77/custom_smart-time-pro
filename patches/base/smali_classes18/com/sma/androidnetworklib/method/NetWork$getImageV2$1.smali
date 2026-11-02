.class public final Lcom/sma/androidnetworklib/method/NetWork$getImageV2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/androidnetworking/interfaces/BitmapRequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/androidnetworklib/method/NetWork;->I0iXXO(Ljava/lang/String;Ljava/io/File;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Ljava/io/File;

.field public final synthetic XIi00iiXO:Lcom/android/mltcode/paycertificationapi/O1XIiIO;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/io/File;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/androidnetworklib/method/NetWork$getImageV2$1;->OXO1:Ljava/io/File;

    iput-object p2, p0, Lcom/sma/androidnetworklib/method/NetWork$getImageV2$1;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/androidnetworking/error/ANError;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/androidnetworklib/method/NetWork$getImageV2$1;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    return-void
.end method

.method public onResponse(Landroid/graphics/Bitmap;)V
    .locals 2

    if-eqz p1, :cond_0

    const-string v0, "get bitmap"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/androidnetworklib/method/NetWork$getImageV2$1;->OXO1:Ljava/io/File;

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {p1, v0, v1}, Lcom/blankj/utilcode/util/ImageUtils;->save(Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;)Z

    iget-object p1, p0, Lcom/sma/androidnetworklib/method/NetWork$getImageV2$1;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleResponse(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
