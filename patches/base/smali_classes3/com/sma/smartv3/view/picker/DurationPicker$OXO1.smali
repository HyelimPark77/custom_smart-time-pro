.class public Lcom/sma/smartv3/view/picker/DurationPicker$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/dg1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/view/picker/DurationPicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "OXO1"
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/view/picker/DurationPicker;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/view/picker/DurationPicker;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/DurationPicker$OXO1;->OXO1:Lcom/sma/smartv3/view/picker/DurationPicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(I)V
    .locals 2
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    iget-object p1, p0, Lcom/sma/smartv3/view/picker/DurationPicker$OXO1;->OXO1:Lcom/sma/smartv3/view/picker/DurationPicker;

    invoke-virtual {p1}, Lcom/sma/smartv3/view/picker/DurationPicker;->getMListener()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/DurationPicker$OXO1;->OXO1:Lcom/sma/smartv3/view/picker/DurationPicker;

    invoke-static {v0}, Lcom/sma/smartv3/view/picker/DurationPicker;->OXO1(Lcom/sma/smartv3/view/picker/DurationPicker;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x3c

    iget-object v1, p0, Lcom/sma/smartv3/view/picker/DurationPicker$OXO1;->OXO1:Lcom/sma/smartv3/view/picker/DurationPicker;

    invoke-static {v1}, Lcom/sma/smartv3/view/picker/DurationPicker;->XIi00iiXO(Lcom/sma/smartv3/view/picker/DurationPicker;)I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
