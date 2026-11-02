.class public final Lcom/sma/smartv3/ui/me/DeveloperActivity$iO;
.super Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperActivity;->zipLog()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic I1:Ljava/io/File;

.field public final synthetic IO:Lcom/sma/smartv3/ui/me/DeveloperActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperActivity;Ljava/io/File;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperActivity$iO;->IO:Lcom/sma/smartv3/ui/me/DeveloperActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/me/DeveloperActivity$iO;->I1:Ljava/io/File;

    invoke-direct {p0}, Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic doInBackground()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/me/DeveloperActivity$iO;->doInBackground()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public doInBackground()Ljava/lang/Void;
    .locals 6

    .line 2
    :try_start_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    sget-object v1, Lcom/bestmafen/androidbase/io/Location;->INTERNAL:Lcom/bestmafen/androidbase/io/Location;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/hn1;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/hn1$OXO1;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/hn1$OXO1;->XIi00iiXO()Lcom/android/mltcode/paycertificationapi/hn1;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/sz0;->XIi00iiXO(Lcom/android/mltcode/paycertificationapi/sz0;Lcom/bestmafen/androidbase/io/Location;Lcom/android/mltcode/paycertificationapi/hn1;Ljava/lang/String;ILjava/lang/Object;)Ljava/io/File;

    move-result-object v1

    .line 3
    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->X0i1O(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v2

    .line 4
    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->X1IX(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    filled-new-array {v1, v2, v0}, [Ljava/io/File;

    move-result-object v0

    .line 5
    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 6
    check-cast v0, Ljava/util/Collection;

    .line 7
    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperActivity$iO;->I1:Ljava/io/File;

    .line 8
    invoke-static {v0, v1}, Lcom/blankj/utilcode/util/ZipUtils;->zipFiles(Ljava/util/Collection;Ljava/io/File;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperActivity$iO;->onSuccess(Ljava/lang/Void;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Void;)V
    .locals 4

    .line 2
    const-string p1, "Share DB And Log"

    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperActivity$iO;->IO:Lcom/sma/smartv3/ui/me/DeveloperActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperActivity;->access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/me/DeveloperActivity;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    .line 4
    :cond_0
    :goto_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperActivity$iO;->I1:Ljava/io/File;

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/sz0;->XO0O10(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    .line 5
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "zipLog -> success, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    .line 6
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.SEND"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 7
    const-string v2, "android.intent.extra.TEXT"

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 8
    const-string v2, "android.intent.extra.STREAM"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 9
    const-string v0, "*/*"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v0, 0x10000000

    .line 10
    invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 11
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperActivity$iO;->IO:Lcom/sma/smartv3/ui/me/DeveloperActivity;

    invoke-static {v1, p1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 12
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 13
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "shareLog -> error, "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method
