.class public final Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/alibaba/sdk/android/oss/callback/OSSCompletedCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;->downOSSMusicLink(Ljava/lang/String;Lcom/sma/smartv3/model/ServerOSSMusicItem;Lcom/alibaba/sdk/android/oss/OSSClient;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/alibaba/sdk/android/oss/callback/OSSCompletedCallback<",
        "Lcom/alibaba/sdk/android/oss/model/GetObjectRequest;",
        "Lcom/alibaba/sdk/android/oss/model/GetObjectResult;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMusicManagerV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicManagerV2Activity.kt\ncom/sma/smartv3/ui/device/MusicManagerV2Activity$downOSSMusicLink$1\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,537:1\n36#2:538\n*S KotlinDebug\n*F\n+ 1 MusicManagerV2Activity.kt\ncom/sma/smartv3/ui/device/MusicManagerV2Activity$downOSSMusicLink$1\n*L\n482#1:538\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMusicManagerV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicManagerV2Activity.kt\ncom/sma/smartv3/ui/device/MusicManagerV2Activity$downOSSMusicLink$1\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,537:1\n36#2:538\n*S KotlinDebug\n*F\n+ 1 MusicManagerV2Activity.kt\ncom/sma/smartv3/ui/device/MusicManagerV2Activity$downOSSMusicLink$1\n*L\n482#1:538\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;

.field public final synthetic XIi00iiXO:Lcom/sma/smartv3/model/ServerOSSMusicItem;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;Lcom/sma/smartv3/model/ServerOSSMusicItem;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/model/ServerOSSMusicItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/alibaba/sdk/android/oss/model/GetObjectRequest;Lcom/alibaba/sdk/android/oss/ClientException;Lcom/alibaba/sdk/android/oss/ServiceException;)V
    .locals 2

    const-string p1, "clientException"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "serviceException"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;->isStopDownLoading()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "Music DownLoad Error"

    invoke-static {p2, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;->access$severMusicNextMusic(Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;->onMusicFileTransferStop()V

    :goto_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTAG()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3}, Lcom/alibaba/sdk/android/oss/ServiceException;->getErrorCode()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " ErrorCode "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTAG()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3}, Lcom/alibaba/sdk/android/oss/ServiceException;->getRequestId()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " RequestId  "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTAG()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3}, Lcom/alibaba/sdk/android/oss/ServiceException;->getHostId()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " HostId   "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTAG()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3}, Lcom/alibaba/sdk/android/oss/ServiceException;->getRawMessage()Ljava/lang/String;

    move-result-object p3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " RawMessag   "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    return-void
.end method

.method public XIi00iiXO(Lcom/alibaba/sdk/android/oss/model/GetObjectRequest;Lcom/alibaba/sdk/android/oss/model/GetObjectResult;)V
    .locals 8

    const-string p1, "toString(...)"

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/alibaba/sdk/android/oss/model/GetObjectResult;->getContentLength()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_3

    long-to-int v2, v0

    new-array v3, v2, [B

    const/4 v4, 0x0

    move v5, v4

    :cond_0
    :goto_0
    int-to-long v6, v5

    cmp-long v6, v6, v0

    if-gez v6, :cond_1

    :try_start_0
    invoke-virtual {p2}, Lcom/alibaba/sdk/android/oss/model/GetObjectResult;->getObjectContent()Ljava/io/InputStream;

    move-result-object v6

    sub-int v7, v2, v5

    invoke-virtual {v6, v3, v5, v7}, Ljava/io/InputStream;->read([BII)I

    move-result v6

    add-int/2addr v5, v6

    iget-object v6, p0, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;

    invoke-virtual {v6}, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;->isStopDownLoading()Z

    move-result v6

    if-nez v6, :cond_0

    iget-object v6, p0, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;

    mul-int/lit8 v7, v5, 0x64

    div-int/2addr v7, v2

    invoke-static {v6, v7}, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;->access$refreshTaskPanelDownLoad(Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/alibaba/sdk/android/oss/common/OSSLog;->logInfo(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    :try_start_1
    new-instance p2, Ljava/io/FileOutputStream;

    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->O001I(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v2

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/model/ServerOSSMusicItem;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/ServerOSSMusicItem;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v2, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {p2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-virtual {p2, v3}, Ljava/io/FileOutputStream;->write([B)V

    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;->isStopDownLoading()Z

    move-result p2

    if-nez p2, :cond_3

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getMDownSuccessSize()I

    move-result p2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;

    add-int/lit8 p2, p2, 0x1

    invoke-virtual {v0, p2}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->setMDownSuccessSize(I)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;

    invoke-static {p2}, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;->access$getMTransmissionMusicList$p(Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;)Ljava/util/List;

    move-result-object p2

    new-instance v0, Lcom/sma/smartv3/model/TransmissionMusicItem;

    new-instance v2, Ljava/io/File;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->O001I(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v3

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/model/ServerOSSMusicItem;

    invoke-virtual {v5}, Lcom/sma/smartv3/model/ServerOSSMusicItem;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v3, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const-string v3, "getAbsolutePath(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/io/File;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->O001I(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v5

    iget-object v6, p0, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/model/ServerOSSMusicItem;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/ServerOSSMusicItem;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->toURI()Ljava/net/URI;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Ljava/io/File;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->O001I(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    iget-object v6, p0, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/model/ServerOSSMusicItem;

    invoke-virtual {v6}, Lcom/sma/smartv3/model/ServerOSSMusicItem;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v1, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v5}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;->XIi00iiXO:Lcom/sma/smartv3/model/ServerOSSMusicItem;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/ServerOSSMusicItem;->getTitle()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v2, v3, v1, p1}, Lcom/sma/smartv3/model/TransmissionMusicItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;->access$severMusicNextMusic(Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/alibaba/sdk/android/oss/common/OSSLog;->logInfo(Ljava/lang/String;)V

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/MusicManagerActivity;->getTAG()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " FileOutputStream "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;->isStopDownLoading()Z

    move-result p1

    if-nez p1, :cond_2

    const-string p1, "Music DownLoad Error"

    new-array p2, v4, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;->access$severMusicNextMusic(Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity;->onMusicFileTransferStop()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic onFailure(Lcom/alibaba/sdk/android/oss/model/OSSRequest;Lcom/alibaba/sdk/android/oss/ClientException;Lcom/alibaba/sdk/android/oss/ServiceException;)V
    .locals 0

    check-cast p1, Lcom/alibaba/sdk/android/oss/model/GetObjectRequest;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;->OXO1(Lcom/alibaba/sdk/android/oss/model/GetObjectRequest;Lcom/alibaba/sdk/android/oss/ClientException;Lcom/alibaba/sdk/android/oss/ServiceException;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Lcom/alibaba/sdk/android/oss/model/OSSRequest;Lcom/alibaba/sdk/android/oss/model/OSSResult;)V
    .locals 0

    check-cast p1, Lcom/alibaba/sdk/android/oss/model/GetObjectRequest;

    check-cast p2, Lcom/alibaba/sdk/android/oss/model/GetObjectResult;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/MusicManagerV2Activity$OXO1;->XIi00iiXO(Lcom/alibaba/sdk/android/oss/model/GetObjectRequest;Lcom/alibaba/sdk/android/oss/model/GetObjectResult;)V

    return-void
.end method
