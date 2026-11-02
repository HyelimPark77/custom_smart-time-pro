.class public final Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$export$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->export()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "[",
        "Lcom/android/mltcode/paycertificationapi/j36;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeveloperTuyaQueryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperTuyaQueryActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$export$3\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,268:1\n13805#2,2:269\n*S KotlinDebug\n*F\n+ 1 DeveloperTuyaQueryActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$export$3\n*L\n242#1:269,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperTuyaQueryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperTuyaQueryActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$export$3\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,268:1\n13805#2,2:269\n*S KotlinDebug\n*F\n+ 1 DeveloperTuyaQueryActivity.kt\ncom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$export$3\n*L\n242#1:269,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$export$3;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1([Lcom/android/mltcode/paycertificationapi/j36;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    array-length v3, v1

    if-nez v3, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v3, v0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$export$3;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;

    invoke-static {v3}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->access$getMNow(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ".csv"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->access$getShareFile(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    invoke-static {v3}, Lcom/blankj/utilcode/util/FileUtils;->createOrExistsFile(Ljava/io/File;)Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "id,bleName,mac,uuid,tuYaKey,info\n"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v5, v1

    :goto_0
    if-ge v2, v5, :cond_1

    aget-object v6, v1, v2

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/j36;->getId()I

    move-result v7

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/j36;->getBleName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/j36;->getMac()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/j36;->getUuid()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/j36;->iO()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v6}, Lcom/android/mltcode/paycertificationapi/j36;->getInfo()Ljava/lang/String;

    move-result-object v12

    const/16 v16, 0x4

    const/16 v17, 0x0

    const-string v13, ","

    const-string v14, " "

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Lcom/android/mltcode/paycertificationapi/oe5;->IXO0OOi(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ","

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\n"

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromString(Ljava/io/File;Ljava/lang/String;)Z

    iget-object v1, v0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$export$3;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_2
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.SEND"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "android.intent.extra.TEXT"

    const-string v4, "Share Csv"

    invoke-virtual {v1, v2, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/sz0;->XO0O10(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    const-string v3, "android.intent.extra.STREAM"

    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string v2, "*/*"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v2, v0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$export$3;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;

    invoke-static {v1, v4}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_3
    :goto_1
    iget-object v1, v0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$export$3;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_4
    const-string v1, "\u6ca1\u6709\u6570\u636e"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$export$3;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;->access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [Lcom/android/mltcode/paycertificationapi/j36;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperTuyaQueryActivity$export$3;->OXO1([Lcom/android/mltcode/paycertificationapi/j36;)V

    return-void
.end method
