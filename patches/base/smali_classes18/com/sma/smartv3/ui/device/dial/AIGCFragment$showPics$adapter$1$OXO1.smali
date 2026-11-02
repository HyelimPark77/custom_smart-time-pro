.class public final Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1$OXO1;
.super Lcom/bumptech/glide/request/target/SimpleTarget;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bumptech/glide/request/target/SimpleTarget<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAIGCFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIGCFragment.kt\ncom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1$convert$1$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,718:1\n11561#2:719\n11896#2,3:720\n35#3,2:723\n*S KotlinDebug\n*F\n+ 1 AIGCFragment.kt\ncom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1$convert$1$2\n*L\n442#1:719\n442#1:720,3\n441#1:723,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAIGCFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIGCFragment.kt\ncom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1$convert$1$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,718:1\n11561#2:719\n11896#2,3:720\n35#3,2:723\n*S KotlinDebug\n*F\n+ 1 AIGCFragment.kt\ncom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1$convert$1$2\n*L\n442#1:719\n442#1:720,3\n441#1:723,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic I1:Ljava/lang/String;

.field public final synthetic IO:Landroid/widget/ImageView;

.field public final synthetic X11iII1O1:[Ljava/lang/String;

.field public final synthetic XXX11i:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

.field public final synthetic iX1O1:I


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;Ljava/lang/String;I[Ljava/lang/String;Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1$OXO1;->IO:Landroid/widget/ImageView;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1$OXO1;->I1:Ljava/lang/String;

    iput p3, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1$OXO1;->iX1O1:I

    iput-object p4, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1$OXO1;->X11iII1O1:[Ljava/lang/String;

    iput-object p5, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1$OXO1;->XXX11i:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    invoke-direct {p0}, Lcom/bumptech/glide/request/target/SimpleTarget;-><init>()V

    return-void
.end method

.method public static synthetic OXO1([Ljava/lang/String;Ljava/io/File;Lcom/sma/smartv3/ui/device/dial/AIGCFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1$OXO1;->iO([Ljava/lang/String;Ljava/io/File;Lcom/sma/smartv3/ui/device/dial/AIGCFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final iO([Ljava/lang/String;Ljava/io/File;Lcom/sma/smartv3/ui/device/dial/AIGCFragment;Landroid/view/View;)V
    .locals 6

    sget-object p3, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p3}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p3

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p0, v2

    new-instance v4, Ljava/io/File;

    sget-object v5, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/uz0;->XOO0ii0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v5

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->iX1O1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v5, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {p0}, Lcom/android/mltcode/paycertificationapi/uz0;->XOO0ii0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object p0

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p0

    const-string v1, "getPath(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v1, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, p0, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "confirm -> "

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object p0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p2

    const-string p3, "requireActivity(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    const-string v0, "bgFile"

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p0, p2, p3}, Lcom/android/mltcode/paycertificationapi/q62;->OO010(Landroid/app/Activity;Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public XIi00iiXO(Landroid/graphics/Bitmap;Lcom/bumptech/glide/request/transition/Transition;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Lcom/bumptech/glide/request/transition/Transition<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    const-string p2, "resource"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1$OXO1;->IO:Landroid/widget/ImageView;

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1$OXO1;->I1:Ljava/lang/String;

    invoke-static {p2}, Lcom/sma/smartv3/util/UtilsKt;->iX1O1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->XOO0ii0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    invoke-direct {v0, v1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sget-object p2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {p1, v0, p2}, Lcom/blankj/utilcode/util/ImageUtils;->save(Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;)Z

    iget p1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1$OXO1;->iX1O1:I

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1$OXO1;->X11iII1O1:[Ljava/lang/String;

    if-eqz p1, :cond_0

    array-length p2, p1

    if-lez p2, :cond_0

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1$OXO1;->XXX11i:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    invoke-virtual {p2, p1}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->setPicUrls([Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1$OXO1;->XXX11i:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    const-string v1, "getPath(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->setBgFile(Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1$OXO1;->IO:Landroid/widget/ImageView;

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1$OXO1;->X11iII1O1:[Ljava/lang/String;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1$OXO1;->XXX11i:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/XOIO11O;

    invoke-direct {v2, p2, v0, v1}, Lcom/android/mltcode/paycertificationapi/XOIO11O;-><init>([Ljava/lang/String;Ljava/io/File;Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Lcom/bumptech/glide/request/transition/Transition;)V
    .locals 0

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPics$adapter$1$OXO1;->XIi00iiXO(Landroid/graphics/Bitmap;Lcom/bumptech/glide/request/transition/Transition;)V

    return-void
.end method
