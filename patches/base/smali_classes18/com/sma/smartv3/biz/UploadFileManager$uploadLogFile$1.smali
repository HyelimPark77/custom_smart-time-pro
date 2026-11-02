.class public final Lcom/sma/smartv3/biz/UploadFileManager$uploadLogFile$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/UploadFileManager;->IiI10X(Ljava/lang/String;Ljava/io/File;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Ljava/lang/String;",
        ">;"
    }
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

.field public final synthetic XIi00iiXO:Ljava/io/File;


# direct methods
.method public constructor <init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;Ljava/io/File;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/io/File;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/UploadFileManager$uploadLogFile$1;->OXO1:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    iput-object p2, p0, Lcom/sma/smartv3/biz/UploadFileManager$uploadLogFile$1;->XIi00iiXO:Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 3

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/biz/UploadFileManager$uploadLogFile$1;->OXO1:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    if-eqz p1, :cond_0

    const-string v0, "Error"

    invoke-interface {p1, v0}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    :cond_0
    return-void

    :cond_1
    invoke-static {p1}, Lcom/androidnetworking/AndroidNetworking;->put(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$PutRequestBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/biz/UploadFileManager$uploadLogFile$1;->XIi00iiXO:Ljava/io/File;

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->addFileBody(Ljava/io/File;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    sget-object v1, Lcom/androidnetworking/common/Priority;->HIGH:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/androidnetworking/common/ANRequest$PostRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/biz/UploadFileManager$uploadLogFile$1$handleResponse$1;

    iget-object v2, p0, Lcom/sma/smartv3/biz/UploadFileManager$uploadLogFile$1;->OXO1:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    invoke-direct {v1, v2, p1}, Lcom/sma/smartv3/biz/UploadFileManager$uploadLogFile$1$handleResponse$1;-><init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest;->getAsString(Lcom/androidnetworking/interfaces/StringRequestListener;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/biz/UploadFileManager$uploadLogFile$1;->OXO1:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/UploadFileManager$uploadLogFile$1;->OXO1(Ljava/lang/String;)V

    return-void
.end method
