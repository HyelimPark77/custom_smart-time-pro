.class public Lcom/sma/smartv3/ui/trim/VideoTrimmerActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/zf6;


# static fields
.field private static final CROP_HEIGHT_KEY:Ljava/lang/String; = "crop_height_key"

.field private static final CROP_WIDTH_KEY:Ljava/lang/String; = "crop_width_key"

.field public static final INTERVAL_KEY:Ljava/lang/String; = "interval"

.field private static final TOTAL_COUNT_KEY:Ljava/lang/String; = "total_count_key"

.field public static final URLS_KEY:Ljava/lang/String; = "urls"

.field private static final VIDEO_PATH_KEY:Ljava/lang/String; = "video-file-path"

.field public static final VIDEO_TRIM_REQUEST_CODE:I = 0x1


# instance fields
.field private mProgressDialog:Landroid/app/ProgressDialog;

.field private trimmerView:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    return-void
.end method

.method private buildDialog(Ljava/lang/String;)Landroid/app/ProgressDialog;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "msg"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/VideoTrimmerActivity;->mProgressDialog:Landroid/app/ProgressDialog;

    if-nez v0, :cond_0

    const-string v0, ""

    invoke-static {p0, v0, p1}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/app/ProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/trim/VideoTrimmerActivity;->mProgressDialog:Landroid/app/ProgressDialog;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/VideoTrimmerActivity;->mProgressDialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0, p1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/trim/VideoTrimmerActivity;->mProgressDialog:Landroid/app/ProgressDialog;

    return-object p1
.end method

.method public static call(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;III)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0,
            0x0,
            0x0
        }
        names = {
            "from",
            "videoPath",
            "cropWidth",
            "cropHeight",
            "totalCount"
        }
    .end annotation

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "video-file-path"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "crop_width_key"

    invoke-virtual {v0, p1, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "crop_height_key"

    invoke-virtual {v0, p1, p3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "total_count_key"

    invoke-virtual {v0, p1, p4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    new-instance p1, Landroid/content/Intent;

    const-class p2, Lcom/sma/smartv3/ui/trim/VideoTrimmerActivity;

    invoke-direct {p1, p0, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "savedInstanceState"
        }
    .end annotation

    return-void
.end method

.method public initView()V
    .locals 6

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f06006c

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p0, p0, v0}, Lcom/bestmafen/androidbase/base/BaseActivity;->setStatusBarColor(Landroid/app/Activity;I)V

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p0, p0, v0}, Lcom/bestmafen/androidbase/base/BaseActivity;->setNavBarColor(Landroid/app/Activity;I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "video-file-path"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    const v2, 0x7f0a0bf4

    invoke-virtual {p0, v2}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    iput-object v2, p0, Lcom/sma/smartv3/ui/trim/VideoTrimmerActivity;->trimmerView:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-virtual {v2, p0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->setOnTrimVideoListener(Lcom/android/mltcode/paycertificationapi/zf6;)V

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "VideoTrimmer initView -> path = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/trim/VideoTrimmerActivity;->trimmerView:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->O1O(Landroid/net/Uri;)V

    iget-object v1, p0, Lcom/sma/smartv3/ui/trim/VideoTrimmerActivity;->trimmerView:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    const-string v2, "crop_width_key"

    const/16 v3, 0x12c

    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    const-string v4, "crop_height_key"

    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    const-string v4, "total_count_key"

    const/16 v5, 0xa

    invoke-virtual {v0, v4, v5}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v1, v2, v3, v0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->IXXOO(III)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0136

    return v0
.end method

.method public onCancel()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/VideoTrimmerActivity;->trimmerView:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->onDestroy()V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/VideoTrimmerActivity;->trimmerView:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->onDestroy()V

    return-void
.end method

.method public onFinishTrim(Ljava/util/ArrayList;I)V
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "urls",
            "interval"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;I)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/VideoTrimmerActivity;->mProgressDialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/VideoTrimmerActivity;->mProgressDialog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "urls"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "interval"

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object p1

    const/4 p2, -0x1

    invoke-virtual {p0, p2, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onPause()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPause()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/VideoTrimmerActivity;->trimmerView:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->iX1O1()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/trim/VideoTrimmerActivity;->trimmerView:Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/trim/view/VideoTrimmerView;->setRestoreState(Z)V

    return-void
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    return-void
.end method

.method public onStartTrim()V
    .locals 1

    const-string v0, ""

    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/trim/VideoTrimmerActivity;->buildDialog(Ljava/lang/String;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method
