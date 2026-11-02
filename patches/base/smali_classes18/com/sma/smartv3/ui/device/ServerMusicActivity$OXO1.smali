.class public final Lcom/sma/smartv3/ui/device/ServerMusicActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/alibaba/sdk/android/oss/callback/OSSCompletedCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/ServerMusicActivity;->getOssMusicList(Ljava/lang/String;Lcom/alibaba/sdk/android/oss/OSSClient;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/alibaba/sdk/android/oss/callback/OSSCompletedCallback<",
        "Lcom/alibaba/sdk/android/oss/model/ListObjectsRequest;",
        "Lcom/alibaba/sdk/android/oss/model/ListObjectsResult;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nServerMusicActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerMusicActivity.kt\ncom/sma/smartv3/ui/device/ServerMusicActivity$getOssMusicList$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,358:1\n35#2,2:359\n*S KotlinDebug\n*F\n+ 1 ServerMusicActivity.kt\ncom/sma/smartv3/ui/device/ServerMusicActivity$getOssMusicList$1\n*L\n197#1:359,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nServerMusicActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerMusicActivity.kt\ncom/sma/smartv3/ui/device/ServerMusicActivity$getOssMusicList$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,358:1\n35#2,2:359\n*S KotlinDebug\n*F\n+ 1 ServerMusicActivity.kt\ncom/sma/smartv3/ui/device/ServerMusicActivity$getOssMusicList$1\n*L\n197#1:359,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/ServerMusicActivity;

.field public final synthetic XIi00iiXO:Ljava/lang/String;

.field public final synthetic iO:Lcom/alibaba/sdk/android/oss/OSSClient;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/ServerMusicActivity;Ljava/lang/String;Lcom/alibaba/sdk/android/oss/OSSClient;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/ServerMusicActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity$OXO1;->XIi00iiXO:Ljava/lang/String;

    iput-object p3, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity$OXO1;->iO:Lcom/alibaba/sdk/android/oss/OSSClient;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/alibaba/sdk/android/oss/model/ListObjectsRequest;Lcom/alibaba/sdk/android/oss/ClientException;Lcom/alibaba/sdk/android/oss/ServiceException;)V
    .locals 3

    const-string p1, "clientException"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "serviceException"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x7f141196

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/ServerMusicActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Lcom/alibaba/sdk/android/oss/ServiceException;->getErrorCode()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ErrorCode "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/ServerMusicActivity;

    invoke-static {p2}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3}, Lcom/alibaba/sdk/android/oss/ServiceException;->getErrorCode()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/ServerMusicActivity;

    invoke-static {p2}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Ljava/lang/String;

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

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/ServerMusicActivity;

    invoke-static {p2}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Ljava/lang/String;

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

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/ServerMusicActivity;

    invoke-static {p2}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Ljava/lang/String;

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

.method public XIi00iiXO(Lcom/alibaba/sdk/android/oss/model/ListObjectsRequest;Lcom/alibaba/sdk/android/oss/model/ListObjectsResult;)V
    .locals 4

    const-string p1, "result"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/alibaba/sdk/android/oss/model/ListObjectsResult;->getObjectSummaries()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/alibaba/sdk/android/oss/model/OSSObjectSummary;

    sget-object v1, Lcom/sma/smartv3/biz/MusicServerManager;->OXO1:Lcom/sma/smartv3/biz/MusicServerManager;

    invoke-virtual {v0}, Lcom/alibaba/sdk/android/oss/model/OSSObjectSummary;->getKey()Ljava/lang/String;

    move-result-object v2

    const-string v3, "getKey(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/biz/MusicServerManager;->iIiiO(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/ServerMusicActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->access$getMCacheList$p(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Lcom/alibaba/sdk/android/oss/model/OSSObjectSummary;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/ServerMusicActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/alibaba/sdk/android/oss/model/ListObjectsResult;->getNextMarker()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/ServerMusicActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->access$getMCacheList$p(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " onSuccess    "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " , size = "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/alibaba/sdk/android/oss/model/ListObjectsResult;->isTruncated()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p2}, Lcom/alibaba/sdk/android/oss/model/ListObjectsResult;->getNextMarker()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/ServerMusicActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->access$getGetMusicNumber$p(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)I

    move-result p1

    const/16 v0, 0xa

    if-ge p1, v0, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/ServerMusicActivity;

    invoke-virtual {p2}, Lcom/alibaba/sdk/android/oss/model/ListObjectsResult;->getNextMarker()Ljava/lang/String;

    move-result-object p2

    const-string v0, "getNextMarker(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->setNextMarker(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/ServerMusicActivity;

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity$OXO1;->XIi00iiXO:Ljava/lang/String;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity$OXO1;->iO:Lcom/alibaba/sdk/android/oss/OSSClient;

    invoke-static {p1, p2, v0}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->access$getOssMusicList(Lcom/sma/smartv3/ui/device/ServerMusicActivity;Ljava/lang/String;Lcom/alibaba/sdk/android/oss/OSSClient;)V

    return-void

    :cond_2
    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/ServerMusicActivity;

    invoke-static {p2}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->access$getMCacheList$p(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)Ljava/util/List;

    move-result-object p2

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "SEVER_MUSIC_LIST_DATA"

    invoke-virtual {p1, v0, p2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ServerMusicActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/ServerMusicActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/ServerMusicActivity;->access$formatMusicData(Lcom/sma/smartv3/ui/device/ServerMusicActivity;)V

    return-void
.end method

.method public bridge synthetic onFailure(Lcom/alibaba/sdk/android/oss/model/OSSRequest;Lcom/alibaba/sdk/android/oss/ClientException;Lcom/alibaba/sdk/android/oss/ServiceException;)V
    .locals 0

    check-cast p1, Lcom/alibaba/sdk/android/oss/model/ListObjectsRequest;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/ServerMusicActivity$OXO1;->OXO1(Lcom/alibaba/sdk/android/oss/model/ListObjectsRequest;Lcom/alibaba/sdk/android/oss/ClientException;Lcom/alibaba/sdk/android/oss/ServiceException;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Lcom/alibaba/sdk/android/oss/model/OSSRequest;Lcom/alibaba/sdk/android/oss/model/OSSResult;)V
    .locals 0

    check-cast p1, Lcom/alibaba/sdk/android/oss/model/ListObjectsRequest;

    check-cast p2, Lcom/alibaba/sdk/android/oss/model/ListObjectsResult;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/ServerMusicActivity$OXO1;->XIi00iiXO(Lcom/alibaba/sdk/android/oss/model/ListObjectsRequest;Lcom/alibaba/sdk/android/oss/model/ListObjectsResult;)V

    return-void
.end method
