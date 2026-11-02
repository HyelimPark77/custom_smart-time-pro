.class public final Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1$handleResponse$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1;->OXO1(Ljava/lang/Boolean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/alibaba/sdk/android/oss/model/AppendObjectRequest;

.field public final synthetic XIi00iiXO:Lcom/alibaba/sdk/android/oss/OSSClient;

.field public final synthetic iO:Ljava/io/File;


# direct methods
.method public constructor <init>(Lcom/alibaba/sdk/android/oss/model/AppendObjectRequest;Lcom/alibaba/sdk/android/oss/OSSClient;Ljava/io/File;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1$handleResponse$1;->OXO1:Lcom/alibaba/sdk/android/oss/model/AppendObjectRequest;

    iput-object p2, p0, Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1$handleResponse$1;->XIi00iiXO:Lcom/alibaba/sdk/android/oss/OSSClient;

    iput-object p3, p0, Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1$handleResponse$1;->iO:Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/Long;)V
    .locals 8

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/work/UploadOSSWorker;->XO0O10()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  fileLength  result = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v2, Lcom/sma/smartv3/work/UploadOSSWorker;->OXO1:Lcom/sma/smartv3/work/UploadOSSWorker;

    iget-object v3, p0, Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1$handleResponse$1;->OXO1:Lcom/alibaba/sdk/android/oss/model/AppendObjectRequest;

    iget-object v4, p0, Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1$handleResponse$1;->XIi00iiXO:Lcom/alibaba/sdk/android/oss/OSSClient;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iget-object v7, p0, Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1$handleResponse$1;->iO:Ljava/io/File;

    invoke-static/range {v2 .. v7}, Lcom/sma/smartv3/work/UploadOSSWorker;->XIi00iiXO(Lcom/sma/smartv3/work/UploadOSSWorker;Lcom/alibaba/sdk/android/oss/model/AppendObjectRequest;Lcom/alibaba/sdk/android/oss/OSSClient;JLjava/io/File;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/sma/smartv3/work/UploadOSSWorker;->iO()Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleResponse(Ljava/lang/Object;)V

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/work/UploadOSSWorker;->XO0O10()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  fileLength  error = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1$handleResponse$1;->OXO1(Ljava/lang/Long;)V

    return-void
.end method
