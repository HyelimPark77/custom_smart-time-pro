.class public final Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/i1Ii1i11X$XIi00iiXO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final OXO1:Landroid/net/Uri;

.field public final XIi00iiXO:Landroid/net/Uri;

.field public final synthetic XO0O10:Landroid/content/Context;

.field public final synthetic iO:Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment$OXO1;->iO:Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;

    iput-object p2, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment$OXO1;->XO0O10:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/uz0;->II1Xi0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/sz0;->XO0O10(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p2

    iput-object p2, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment$OXO1;->OXO1:Landroid/net/Uri;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/uz0;->iIXi1iiXI(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    const-string p2, "fromFile(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment$OXO1;->XIi00iiXO:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public OXO1()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment$OXO1;->OXO1:Landroid/net/Uri;

    return-object v0
.end method

.method public XIi00iiXO(Landroid/net/Uri;)V
    .locals 2

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment$OXO1;->iO:Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->access$getMSelectAvatarPopup$p(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Lcom/android/mltcode/paycertificationapi/xz3;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment$OXO1;->XO0O10:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/provider/MediaStore$Images$Media;->getBitmap(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment$OXO1;->iO:Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->access$getMRouteImg(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    invoke-static {v0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->access$getMRlShareCard(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/view/View;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-static {v0}, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;->access$getMRouteImgFigure(Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment;)Landroid/widget/ImageView;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public getResult()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/DetailCustomizeCardFragment$OXO1;->XIi00iiXO:Landroid/net/Uri;

    return-object v0
.end method
