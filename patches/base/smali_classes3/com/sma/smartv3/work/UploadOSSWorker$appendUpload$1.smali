.class public final Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/work/UploadOSSWorker;->XOO0ii0(Ljava/lang/String;Lcom/alibaba/sdk/android/oss/OSSClient;Ljava/lang/String;Ljava/io/File;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic O00:Ljava/io/File;

.field public final synthetic OXO1:Ljava/lang/String;

.field public final synthetic XIi00iiXO:Lcom/alibaba/sdk/android/oss/OSSClient;

.field public final synthetic XO0O10:Lcom/alibaba/sdk/android/oss/model/AppendObjectRequest;

.field public final synthetic iO:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/alibaba/sdk/android/oss/OSSClient;Ljava/lang/String;Lcom/alibaba/sdk/android/oss/model/AppendObjectRequest;Ljava/io/File;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1;->OXO1:Ljava/lang/String;

    iput-object p2, p0, Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1;->XIi00iiXO:Lcom/alibaba/sdk/android/oss/OSSClient;

    iput-object p3, p0, Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1;->iO:Ljava/lang/String;

    iput-object p4, p0, Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1;->XO0O10:Lcom/alibaba/sdk/android/oss/model/AppendObjectRequest;

    iput-object p5, p0, Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1;->O00:Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/Boolean;)V
    .locals 12

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/sma/smartv3/work/UploadOSSWorker;->OXO1:Lcom/sma/smartv3/work/UploadOSSWorker;

    iget-object v0, p0, Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1;->OXO1:Ljava/lang/String;

    iget-object v1, p0, Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1;->XIi00iiXO:Lcom/alibaba/sdk/android/oss/OSSClient;

    iget-object v2, p0, Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1;->iO:Ljava/lang/String;

    new-instance v3, Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1$handleResponse$1;

    iget-object v4, p0, Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1;->XO0O10:Lcom/alibaba/sdk/android/oss/model/AppendObjectRequest;

    iget-object v5, p0, Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1;->O00:Ljava/io/File;

    invoke-direct {v3, v4, v1, v5}, Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1$handleResponse$1;-><init>(Lcom/alibaba/sdk/android/oss/model/AppendObjectRequest;Lcom/alibaba/sdk/android/oss/OSSClient;Ljava/io/File;)V

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/sma/smartv3/work/UploadOSSWorker;->XXI(Ljava/lang/String;Lcom/alibaba/sdk/android/oss/OSSClient;Ljava/lang/String;Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V

    return-void

    :cond_0
    sget-object v6, Lcom/sma/smartv3/work/UploadOSSWorker;->OXO1:Lcom/sma/smartv3/work/UploadOSSWorker;

    iget-object v7, p0, Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1;->XO0O10:Lcom/alibaba/sdk/android/oss/model/AppendObjectRequest;

    iget-object v8, p0, Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1;->XIi00iiXO:Lcom/alibaba/sdk/android/oss/OSSClient;

    const-wide/16 v9, 0x0

    iget-object v11, p0, Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1;->O00:Ljava/io/File;

    invoke-static/range {v6 .. v11}, Lcom/sma/smartv3/work/UploadOSSWorker;->XIi00iiXO(Lcom/sma/smartv3/work/UploadOSSWorker;Lcom/alibaba/sdk/android/oss/model/AppendObjectRequest;Lcom/alibaba/sdk/android/oss/OSSClient;JLjava/io/File;)V

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

    const-string v1, "  file is not exist, handleError  error = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/work/UploadOSSWorker$appendUpload$1;->OXO1(Ljava/lang/Boolean;)V

    return-void
.end method
