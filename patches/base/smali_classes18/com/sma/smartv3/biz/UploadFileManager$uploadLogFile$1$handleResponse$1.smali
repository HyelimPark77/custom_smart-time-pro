.class public final Lcom/sma/smartv3/biz/UploadFileManager$uploadLogFile$1$handleResponse$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/androidnetworking/interfaces/StringRequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/UploadFileManager$uploadLogFile$1;->OXO1(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/android/mltcode/paycertificationapi/O1XIiIO;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic XIi00iiXO:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/UploadFileManager$uploadLogFile$1$handleResponse$1;->OXO1:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    iput-object p2, p0, Lcom/sma/smartv3/biz/UploadFileManager$uploadLogFile$1$handleResponse$1;->XIi00iiXO:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/androidnetworking/error/ANError;)V
    .locals 3

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/androidnetworking/error/ANError;->getErrorDetail()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "uploadLogFile -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/UploadFileManager$uploadLogFile$1$handleResponse$1;->OXO1:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    if-eqz v0, :cond_3

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/androidnetworking/error/ANError;->getErrorBody()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    :cond_1
    const-string p1, "Error"

    :cond_2
    invoke-interface {v0, p1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method public onResponse(Ljava/lang/String;)V
    .locals 1

    iget-object p1, p0, Lcom/sma/smartv3/biz/UploadFileManager$uploadLogFile$1$handleResponse$1;->OXO1:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/biz/UploadFileManager$uploadLogFile$1$handleResponse$1;->XIi00iiXO:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleResponse(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
