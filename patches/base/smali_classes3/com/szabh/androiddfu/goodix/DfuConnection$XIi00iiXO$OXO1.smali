.class public Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;->OIi0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;


# direct methods
.method public constructor <init>(Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO$OXO1;->IO:Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO$OXO1;->IO:Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;

    iget-object v0, v0, Lcom/szabh/androiddfu/goodix/DfuConnection$XIi00iiXO;->OXO1:Lcom/szabh/androiddfu/goodix/DfuConnection;

    invoke-static {v0}, Lcom/szabh/androiddfu/goodix/DfuConnection;->XO0O10(Lcom/szabh/androiddfu/goodix/DfuConnection;)Lcom/android/mltcode/paycertificationapi/OIO1Xii1;

    move-result-object v0

    const/16 v1, 0xf7

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/OIO1Xii1;->OIi0(I)Z

    return-void
.end method
