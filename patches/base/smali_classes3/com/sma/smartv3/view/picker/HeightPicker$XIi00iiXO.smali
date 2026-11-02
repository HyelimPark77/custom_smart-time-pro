.class public Lcom/sma/smartv3/view/picker/HeightPicker$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/dg1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/view/picker/HeightPicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "XIi00iiXO"
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/view/picker/HeightPicker;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/view/picker/HeightPicker;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/HeightPicker$XIi00iiXO;->OXO1:Lcom/sma/smartv3/view/picker/HeightPicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(I)V
    .locals 3
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    iget-object p1, p0, Lcom/sma/smartv3/view/picker/HeightPicker$XIi00iiXO;->OXO1:Lcom/sma/smartv3/view/picker/HeightPicker;

    invoke-static {p1}, Lcom/sma/smartv3/view/picker/HeightPicker;->XIi00iiXO(Lcom/sma/smartv3/view/picker/HeightPicker;)I

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/view/picker/HeightPicker$XIi00iiXO;->OXO1:Lcom/sma/smartv3/view/picker/HeightPicker;

    invoke-virtual {p1}, Lcom/sma/smartv3/view/picker/HeightPicker;->getMListener()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/view/picker/HeightPicker$XIi00iiXO;->OXO1:Lcom/sma/smartv3/view/picker/HeightPicker;

    invoke-static {v1}, Lcom/sma/smartv3/view/picker/HeightPicker;->iO(Lcom/sma/smartv3/view/picker/HeightPicker;)[I

    move-result-object v1

    aget v0, v1, v0

    invoke-static {}, Lcom/sma/smartv3/view/picker/HeightPicker;->OXO1()I

    move-result v1

    add-int/2addr v0, v1

    int-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/view/picker/HeightPicker$XIi00iiXO;->OXO1:Lcom/sma/smartv3/view/picker/HeightPicker;

    invoke-virtual {p1}, Lcom/sma/smartv3/view/picker/HeightPicker;->getMListener()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/view/picker/HeightPicker$XIi00iiXO;->OXO1:Lcom/sma/smartv3/view/picker/HeightPicker;

    invoke-static {v1}, Lcom/sma/smartv3/view/picker/HeightPicker;->iO(Lcom/sma/smartv3/view/picker/HeightPicker;)[I

    move-result-object v1

    aget v0, v1, v0

    add-int/lit8 v0, v0, 0x3

    iget-object v1, p0, Lcom/sma/smartv3/view/picker/HeightPicker$XIi00iiXO;->OXO1:Lcom/sma/smartv3/view/picker/HeightPicker;

    invoke-static {v1}, Lcom/sma/smartv3/view/picker/HeightPicker;->iO(Lcom/sma/smartv3/view/picker/HeightPicker;)[I

    move-result-object v1

    const/4 v2, 0x1

    aget v1, v1, v2

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/l76;->XIi00iiXO(II)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
