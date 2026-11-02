.class public final Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1$OXO1;
.super Lcom/bumptech/glide/request/target/SimpleTarget;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Landroid/graphics/Bitmap;I)V
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
    value = "SMAP\nAIGCFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIGCFragment.kt\ncom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1$convert$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,718:1\n1563#2:719\n1634#2,3:720\n35#3,2:723\n*S KotlinDebug\n*F\n+ 1 AIGCFragment.kt\ncom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1$convert$1$2\n*L\n505#1:719\n505#1:720,3\n504#1:723,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAIGCFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIGCFragment.kt\ncom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1$convert$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,718:1\n1563#2:719\n1634#2,3:720\n35#3,2:723\n*S KotlinDebug\n*F\n+ 1 AIGCFragment.kt\ncom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1$convert$1$2\n*L\n505#1:719\n505#1:720,3\n504#1:723,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic I1:I

.field public final synthetic IO:Landroid/widget/ImageView;

.field public final synthetic X11iII1O1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

.field public final synthetic iX1O1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;ILjava/util/List;Lcom/sma/smartv3/ui/device/dial/AIGCFragment;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ImageView;",
            "I",
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/sma/smartv3/ui/device/dial/AIGCFragment;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1$OXO1;->IO:Landroid/widget/ImageView;

    iput p2, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1$OXO1;->I1:I

    iput-object p3, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1$OXO1;->iX1O1:Ljava/util/List;

    iput-object p4, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1$OXO1;->X11iII1O1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    invoke-direct {p0}, Lcom/bumptech/glide/request/target/SimpleTarget;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Ljava/util/List;Ljava/io/File;Lcom/sma/smartv3/ui/device/dial/AIGCFragment;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1$OXO1;->iO(Ljava/util/List;Ljava/io/File;Lcom/sma/smartv3/ui/device/dial/AIGCFragment;Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method

.method public static final iO(Ljava/util/List;Ljava/io/File;Lcom/sma/smartv3/ui/device/dial/AIGCFragment;Ljava/lang/String;Landroid/view/View;)V
    .locals 3

    sget-object p4, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p4}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p4

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    new-instance v1, Ljava/io/File;

    sget-object v2, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/uz0;->XOO0ii0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v2

    invoke-direct {v1, v2, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {p0}, Lcom/android/mltcode/paycertificationapi/uz0;->XOO0ii0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object p0

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p0

    const-string p3, "getPath(...)"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Lcom/google/gson/Gson;

    invoke-direct {p3}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {p3, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4, p0, p3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

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

    const-string p4, "bgFile"

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p4, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p0, p2, p3}, Lcom/android/mltcode/paycertificationapi/q62;->OO010(Landroid/app/Activity;Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public XIi00iiXO(Landroid/graphics/Bitmap;Lcom/bumptech/glide/request/transition/Transition;)V
    .locals 4
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

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1$OXO1;->IO:Landroid/widget/ImageView;

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    new-instance p2, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->XOO0ii0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    const-string v1, "aigc_kdxf.png"

    invoke-direct {p2, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {p1, p2, v0}, Lcom/blankj/utilcode/util/ImageUtils;->save(Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;)Z

    iget p1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1$OXO1;->I1:I

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1$OXO1;->iX1O1:Ljava/util/List;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1$OXO1;->X11iII1O1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1$OXO1;->iX1O1:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->setPicUrlsBitmap(Ljava/util/List;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1$OXO1;->X11iII1O1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    invoke-virtual {p2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v2, "getPath(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment;->setBgFile(Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1$OXO1;->IO:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1$OXO1;->iX1O1:Ljava/util/List;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1$OXO1;->X11iII1O1:Lcom/sma/smartv3/ui/device/dial/AIGCFragment;

    new-instance v3, Lcom/android/mltcode/paycertificationapi/Xi;

    invoke-direct {v3, v0, p2, v2, v1}, Lcom/android/mltcode/paycertificationapi/Xi;-><init>(Ljava/util/List;Ljava/io/File;Lcom/sma/smartv3/ui/device/dial/AIGCFragment;Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Lcom/bumptech/glide/request/transition/Transition;)V
    .locals 0

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/device/dial/AIGCFragment$showPicsSparkChain$adapter$1$OXO1;->XIi00iiXO(Landroid/graphics/Bitmap;Lcom/bumptech/glide/request/transition/Transition;)V

    return-void
.end method
