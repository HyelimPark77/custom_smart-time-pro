.class public final Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity$onBottomClick$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/androidnetworklib/method/HttpProgressCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->onBottomClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/sma/androidnetworklib/method/HttpProgressCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeveloperUpgradeGActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperUpgradeGActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeGActivity$onBottomClick$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,210:1\n774#2:211\n865#2,2:212\n*S KotlinDebug\n*F\n+ 1 DeveloperUpgradeGActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeGActivity$onBottomClick$1\n*L\n193#1:211\n193#1:212,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperUpgradeGActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperUpgradeGActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeGActivity$onBottomClick$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,210:1\n774#2:211\n865#2,2:212\n*S KotlinDebug\n*F\n+ 1 DeveloperUpgradeGActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeGActivity$onBottomClick$1\n*L\n193#1:211\n193#1:212,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity$onBottomClick$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 14

    new-instance p1, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->XXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity$onBottomClick$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->access$getMLatest$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;)Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity$onBottomClick$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;

    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/ZipUtils;->unzipFile(Ljava/io/File;Ljava/io/File;)Ljava/util/List;

    move-result-object p1

    const-string v0, "unzipFile(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ljava/io/File;

    invoke-virtual {v6}, Ljava/io/File;->isFile()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v6

    const-string v7, "getPath(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, ".bin"

    invoke-static {v6, v7, v5, v4, v3}, Lcom/android/mltcode/paycertificationapi/oe5;->O0Ii(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v1, v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->access$setMDfuFiles$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;Ljava/util/List;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity$onBottomClick$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->access$getMDfuFiles$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;)Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_2

    const-string p1, "mDfuFiles"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v3

    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-ge p1, v4, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity$onBottomClick$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;

    invoke-static {p1, v5}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->access$setMStarted(Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity$onBottomClick$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->access$getProgressButton(Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;)Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p1

    const v0, 0x7f140bf5

    invoke-static {p1, v0, v5, v4, v3}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    return-void

    :cond_3
    sget-object v6, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v7, Lcom/szabh/smable3/BleKey;->OTA:Lcom/szabh/smable3/BleKey;

    sget-object v8, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v12, 0x1c

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v6 .. v13}, Lcom/szabh/smable3/component/BaseBleConnector;->sendData$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;[BZZILjava/lang/Object;)Z

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity$onBottomClick$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;->access$setMStarted(Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity;Z)V

    return-void
.end method

.method public handleProgress(I)V
    .locals 0

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeGActivity$onBottomClick$1;->OXO1(Ljava/lang/String;)V

    return-void
.end method
