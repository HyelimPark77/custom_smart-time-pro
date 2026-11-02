.class public final Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/X11iXOOOi;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->bgOnClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;

.field public final synthetic XIi00iiXO:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$OXO1;->XIi00iiXO:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(I)V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$OXO1;->OXO1:Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity$OXO1;->XIi00iiXO:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    const-string v1, "fromFile(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;->access$toCropPic(Lcom/sma/smartv3/ui/device/dial/BaseDialCustomizeActivity;Landroid/net/Uri;)V

    return-void
.end method
